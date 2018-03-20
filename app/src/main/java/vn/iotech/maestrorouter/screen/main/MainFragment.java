package vn.iotech.maestrorouter.screen.main;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import vn.iotech.base.viper.Presenter;
import vn.iotech.base.viper.ViewFragment;
import vn.iotech.maestrorouter.R;

/**
 * The Main Fragment
 */
public class MainFragment extends ViewFragment<MainContract.Presenter> implements MainContract.View {

  @BindView(R.id.toolbar)
  Toolbar mToolbar;
  @BindView(R.id.drawer_layout)
  DrawerLayout mDrawerLayout;
  @BindView(R.id.nav_view)
  NavigationView mNavigationView;

  @SuppressLint("UseSparseArrays")
  private Map<Integer, Presenter> mMap = new HashMap<>();
  private static final int FRAME_ID = R.id.content_frame;
  private static final int DEFAULT_TAB_ID = R.id.nav_dashboard;

  public static MainFragment getInstance() {
    return new MainFragment();
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_main;
  }

  @Override
  public void initLayout() {
    super.initLayout();
    setupActionbar();
    switchTab(DEFAULT_TAB_ID);
    setupNavigationView();
  }

  private void setupActionbar() {
    getBaseActivity().setSupportActionBar(mToolbar);
    ActionBar actionBar = getBaseActivity().getSupportActionBar();
    assert actionBar != null;
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
    mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mDrawerLayout.openDrawer(GravityCompat.START);
      }
    });
  }

  private void setupNavigationView() {
    mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.nav_quick_setup) {
          mPresenter.goToQuickSetup();
        } else {
          switchTab(item.getItemId());
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
      }
    });
  }

  private void switchTab(int tabId) {
    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
    for (Presenter presenter : mMap.values()) {
      transaction.hide(presenter.getFragment());
    }
    if (mMap.containsKey(tabId)) {
      transaction.show(mMap.get(tabId).getFragment());
    } else {
      transaction.add(FRAME_ID, createFragment(tabId));
    }
    transaction.commit();
  }

  private Fragment createFragment(int tabId) {
    Presenter presenter = mPresenter.getTab(tabId);
    String title = mPresenter.getTitle(tabId);
    mToolbar.setTitle(title);
    mMap.put(tabId, presenter);
    return presenter.getFragment();
  }

}
