package alamin.c.islamicapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import alamin.c.islamicapp.fragment.BlessingFragment;
import alamin.c.islamicapp.fragment.LikeFragment;
import alamin.c.islamicapp.fragment.SubjectFragment;

class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:{
                LikeFragment likeFragment=new LikeFragment();
                return likeFragment;
            }
            case 1:{
                SubjectFragment subjectFragment=new SubjectFragment();
                return  subjectFragment;
            }
            case 2:{
                BlessingFragment blessingFragment=new BlessingFragment();
                return  blessingFragment;
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
                return  "বিষয়";
            case  2:
                return "সব দোআ";
             default:
                 return null;

        }
    }

}
