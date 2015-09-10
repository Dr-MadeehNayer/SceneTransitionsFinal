package com.madeeh.scenetransitions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class SceneTransitionsActivity extends ActionBarActivity {

    ViewGroup layout;
    Scene scene1;
    Scene scene2;
    Transition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_transitions);

        layout=(ViewGroup)findViewById(R.id.container);

        transition = TransitionInflater.from(this).inflateTransition(R.transition.transition);

        scene1 = Scene.getSceneForLayout(layout, R.layout.scene1_layout, this);

        scene2 = Scene.getSceneForLayout(layout, R.layout.scene2_layout, this);

        scene1.enter();

    }

    public void goToScene2 (View view)
    {
        //TransitionManager.go(scene2);
        TransitionManager.go(scene2,transition);
    }

    public void goToScene1 (View view)
    {
       // TransitionManager.go(scene1);
        TransitionManager.go(scene1,transition);
    }
}
