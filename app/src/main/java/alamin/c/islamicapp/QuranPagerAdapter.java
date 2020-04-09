package alamin.c.islamicapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import alamin.c.islamicapp.fragment.BlessingFragment;
import alamin.c.islamicapp.fragment.LikeFragment;
import alamin.c.islamicapp.fragment.SubjectFragment;
import alamin.c.islamicapp.quranFragments.BookmarkFragment;
import alamin.c.islamicapp.quranFragments.ParaFragment;
import alamin.c.islamicapp.quranFragments.SuraListFragment;

class QuranPagerAdapter extends FragmentPagerAdapter {
    public QuranPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:{
                BookmarkFragment bookmarkFragment=new BookmarkFragment();
                return bookmarkFragment;
            }
            case 1:{
                SuraListFragment suraListFragment=new SuraListFragment();
                return  suraListFragment;
            }
            case 2:{
                ParaFragment paraFragment=new ParaFragment();
                return paraFragment;
            }
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence  getPageTitle(int position){
        switch (position){
            case 0:
                return  "পছন্দ";
            case 1:
                return  "সব সূরা";
            case  2:
                return "পারা";
             default:
                 return null;

        }
    }

}
