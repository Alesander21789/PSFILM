package com.cifprodolfoucha.PSFilms.clasesAdaptadoras;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cifprodolfoucha.PSFilms.fragments.fragmentComentarios;
import com.cifprodolfoucha.PSFilms.fragments.fragmentOtras;
import com.cifprodolfoucha.PSFilms.fragments.fragmentReparto;
import com.cifprodolfoucha.PSFilms.fragments.fragmentResumen;

public class MiFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 5;
    private String tabTitles[] =
            new String[] { "Resumen", "Reparto", "Otras", "Comentarios", "Trailer"};

    public MiFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;

        switch(position) {
            case 0:
                f= fragmentResumen.newInstance();
                break;
            case 2:
            f= fragmentOtras.newInstance();
             break;
            case 1:
               f= fragmentReparto.newInstance();
                break;
            case 3:
                f = fragmentComentarios.newInstance();
                break;

        }

        return f;
}

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
