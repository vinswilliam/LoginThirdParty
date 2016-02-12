package id.co.andr.siuli.facebooklogin.login;

import android.content.Context;

import com.facebook.FacebookSdk;

/**
 * Created by william on 2/10/2016.
 */
public class LoginPresenter implements ILoginPresenter {

    private ILoginView mView;
    private Context mContext;

    public LoginPresenter(ILoginView view, Context context){
        mView = view;
        mContext = context;
    }

    @Override
    public void facebookLogin() {

    }
}
