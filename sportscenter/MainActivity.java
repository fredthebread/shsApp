package shsApp.sportscenter;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	ActionBar.Tab fragTab1, fragTab2, fragTab3;
	Fragment fragmentTab1 = new FragmentTab1();
	Fragment fragmentTab2 = new FragmentTab2();
	Fragment fragmentTab3 = new FragmentTab3();
	
	private String fragTab1Text = "Home";
	private String fragTab2Text = "Information";
	private String fragTab3Text = "News";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		fragTab1 = actionBar.newTab().setText(fragTab1Text);
		fragTab2 = actionBar.newTab().setText(fragTab2Text);
		fragTab3 = actionBar.newTab().setText(fragTab3Text);
		
		fragTab1.setTabListener(new TabListener(fragmentTab1));
		fragTab2.setTabListener(new TabListener(fragmentTab2));
		fragTab3.setTabListener(new TabListener(fragmentTab3));
		
		actionBar.addTab(fragTab1);
		actionBar.addTab(fragTab2);
		actionBar.addTab(fragTab3);
	}
}
