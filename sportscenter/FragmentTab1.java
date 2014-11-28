package shsApp.sportscenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

public class FragmentTab1 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanaceState){
		
		View rootView = inflater.inflate(R.layout.activity_fragment_tab1, container, false);
		return rootView;
		
	}
}
