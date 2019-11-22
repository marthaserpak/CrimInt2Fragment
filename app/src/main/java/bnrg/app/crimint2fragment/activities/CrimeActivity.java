package bnrg.app.crimint2fragment.activities;

import androidx.fragment.app.Fragment;

import bnrg.app.crimint2fragment.abstracts.SingleFragmentActivity;
import bnrg.app.crimint2fragment.fragments.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
