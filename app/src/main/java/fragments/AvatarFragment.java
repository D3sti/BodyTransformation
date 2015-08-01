package fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.antihacker.bodytransformation.R;

import entities.BodyInfo;
import interfaces.IBodyInfo;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AvatarFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AvatarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AvatarFragment extends Fragment implements View.OnClickListener {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_BODY_INFO = "bodyInfo";


    private IBodyInfo _bodyInfo;
    private Button _btnAddNewState;


    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AvatarFragment.
     */
    public static AvatarFragment newInstance(IBodyInfo bodyInfo) {
        AvatarFragment fragment = new AvatarFragment();

        //Create Bundle with data to set args
        Bundle args  = new Bundle();
        args.putParcelable(ARG_BODY_INFO, bodyInfo );
        //set the args to the fragment
        fragment.setArguments(args);
        return fragment;
    }

    public AvatarFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Save the Data between fragment / landscape switch (will be destroyed)
        if (getArguments() != null) {
            _bodyInfo = getArguments().getParcelable(ARG_BODY_INFO);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //set after the activity is loaded completely
        _btnAddNewState = (Button) getActivity().findViewById(R.id.btn_addNewStatus);
        _btnAddNewState.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Blows up the Xml-Layout fragment for inputs
        View view = inflater.inflate(R.layout.fragment_avatar,container,false);
        return  view;
        //TextView textView = new TextView(getActivity());
        //textView.setText(R.string.hello_blank_fragment);
        //return textView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        // Send the event and Uri to the host activity
        if (mListener != null) {
            mListener.onAddNewState();
        }
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
        public void onAddNewState();
    }

}
