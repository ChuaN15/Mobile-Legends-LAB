package chuan.aov;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentGuideContent.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentGuideContent#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentGuideContent extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentGuideContent() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentGuideContent.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentGuideContent newInstance(String param1, String param2) {
        FragmentGuideContent fragment = new FragmentGuideContent();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fragment_guide_content, container,false);
        TextView tvName = (TextView) rootView.findViewById(R.id.tvname);
        TextView tvIntro = (TextView) rootView.findViewById(R.id.tvintro);
        TextView tvItemBuild = (TextView) rootView.findViewById(R.id.tvitembuild);
        ImageView ivstat = (ImageView) rootView.findViewById(R.id.ivstat);
        ImageView ivemblem = (ImageView) rootView.findViewById(R.id.ivemblem);
        ImageView ivitem = (ImageView) rootView.findViewById(R.id.ivitembuild);
        ImageView ivskill = (ImageView) rootView.findViewById(R.id.ivspell);
        TextView tvspell = (TextView) rootView.findViewById(R.id.tvspell);
        TextView tvemblem = (TextView) rootView.findViewById(R.id.tvemblem);
        TextView tvtips = (TextView) rootView.findViewById(R.id.tvtips);
        TextView tvsummary = (TextView) rootView.findViewById(R.id.tvsummary);
        TextView tvskill11 = (TextView) rootView.findViewById(R.id.tvskill11);
        TextView tvskill111 = (TextView) rootView.findViewById(R.id.tvskill111);
        TextView tvskill1 = (TextView) rootView.findViewById(R.id.tvskill1);
        ImageView ivskill1 = (ImageView) rootView.findViewById(R.id.ivskill1);
        TextView tvskill22 = (TextView) rootView.findViewById(R.id.tvskill22);
        TextView tvskill222 = (TextView) rootView.findViewById(R.id.tvskill222);
        TextView tvskill2 = (TextView) rootView.findViewById(R.id.tvskill2);
        ImageView ivskill2 = (ImageView) rootView.findViewById(R.id.ivskill2);
        TextView tvskill33 = (TextView) rootView.findViewById(R.id.tvskill33);
        TextView tvskill333 = (TextView) rootView.findViewById(R.id.tvskill333);
        TextView tvskill3 = (TextView) rootView.findViewById(R.id.tvskill3);
        ImageView ivskill3 = (ImageView) rootView.findViewById(R.id.ivskill3);
        TextView tvskill44 = (TextView) rootView.findViewById(R.id.tvskill44);
        TextView tvskill444 = (TextView) rootView.findViewById(R.id.tvskill444);
        TextView tvskill4 = (TextView) rootView.findViewById(R.id.tvskill4);
        ImageView ivskill4 = (ImageView) rootView.findViewById(R.id.ivskill4);

        Bundle bundle = this.getArguments();
        String name = bundle.getString("name");
        String emblem = bundle.getString("emblem");
        String intro = bundle.getString("intro");
        String itemdesc = bundle.getString("itemdesc");
        String spell = bundle.getString("spell");
        String emblemtext = bundle.getString("emblemtext");
        String tips = bundle.getString("tips");
        String summary = bundle.getString("summary");
        String stat = bundle.getString("imagestat");
        String itembuild = bundle.getString("itembuild");
        String skillbuild = bundle.getString("skillbuild");
        String skill11 = bundle.getString("skill11");
        String skill111 = bundle.getString("skill111");
        String skill1 = bundle.getString("skill1");
        String images1 = bundle.getString("images1");
        String skill22 = bundle.getString("skill22");
        String skill222 = bundle.getString("skill222");
        String skill2 = bundle.getString("skill2");
        String images2 = bundle.getString("images2");
        String skill33 = bundle.getString("skill33");
        String skill333 = bundle.getString("skill333");
        String skill3 = bundle.getString("skill3");
        String images3 = bundle.getString("images3");
        String skill44 = bundle.getString("skill44");
        String skill444 = bundle.getString("skill444");
        String skill4 = bundle.getString("skill4");
        String images4 = bundle.getString("images4");

        Resources resskill1 = getResources();
        int resIDDskill1 = resskill1.getIdentifier(images1 , "drawable", "chuan.aov");
        Drawable imagees1 = resskill1.getDrawable(resIDDskill1);

        Resources resstat = getResources();
        int resIDDstat = resstat.getIdentifier(stat , "drawable", "chuan.aov");
        Drawable statt = resstat.getDrawable(resIDDstat);

        Resources resemblem = getResources();
        int resIDDemblem = resemblem.getIdentifier(emblem , "drawable", "chuan.aov");
        Drawable emblemm = resemblem.getDrawable(resIDDemblem);

        Resources resitembuild = getResources();
        int resIDDitembuild = resitembuild.getIdentifier(itembuild , "drawable", "chuan.aov");
        Drawable itembuildd = resitembuild.getDrawable(resIDDitembuild);

        Resources resskillbuild = getResources();
        int resIDDskillbuild = resskillbuild.getIdentifier(skillbuild , "drawable", "chuan.aov");
        Drawable skillbuildd = resskillbuild.getDrawable(resIDDskillbuild);

        Resources resskill2 = getResources();
        int resIDDskill2 = resskill2.getIdentifier(images2 , "drawable", "chuan.aov");
        Drawable imagees2 = resskill2.getDrawable(resIDDskill2);

        Resources resskill3 = getResources();
        int resIDDskill3 = resskill3.getIdentifier(images3 , "drawable", "chuan.aov");
        Drawable imagees3 = resskill3.getDrawable(resIDDskill3);

        Resources resskill4 = getResources();
        int resIDDskill4 = resskill4.getIdentifier(images4 , "drawable", "chuan.aov");
        Drawable imagees4 = resskill4.getDrawable(resIDDskill4);

        getActivity().setTitle(name);
        tvName.setText(name);
        tvIntro.setText(intro);
        tvItemBuild.setText(itemdesc);
        tvspell.setText(spell);
        tvemblem.setText(emblemtext);
        tvtips.setText(tips);
        tvsummary.setText(summary);
        ivstat.setImageDrawable(statt);
        ivitem.setImageDrawable(itembuildd);
        ivemblem.setImageDrawable(emblemm);
        ivskill.setImageDrawable(skillbuildd);
        tvskill11.setText(skill11);
        tvskill111.setText(skill111);
        tvskill1.setText(skill1);
        ivskill1.setImageDrawable(imagees1);
        tvskill22.setText(skill22);
        tvskill222.setText(skill222);
        tvskill2.setText(skill2);
        ivskill2.setImageDrawable(imagees2);
        tvskill33.setText(skill33);
        tvskill333.setText(skill333);
        tvskill3.setText(skill3);
        ivskill3.setImageDrawable(imagees3);
        tvskill44.setText(skill44);
        tvskill444.setText(skill444);
        tvskill4.setText(skill4);
        ivskill4.setImageDrawable(imagees4);
        return  rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
