package com.example.RecordBreakers;

import android.app.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


@RunWith(RobolectricTestRunner.class)
class RecordBreakersTest {
    @Test
    public void clickingButton_shouldChangeResultsViewText() throws Exception {
        Activity activity = Robolectric.buildActivity(RecordBreakers.class).create().get();

//        Button pressMeButton = (Button) activity.findViewById(R.id.press_me_button);
//        TextView results = (TextView) activity.findViewById(R.id.results_text_view);
//
//        pressMeButton.performClick();
//        String resultsText = results.getText().toString();
//        assertThat(resultsText, equalTo("Testing Android Rocks!"));
    }
}
