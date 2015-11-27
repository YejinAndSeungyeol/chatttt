package mobile_test.kookmin.ac.kr.chat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class Login extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //버튼에 클릭 리스너를 정한다
        View logB = this.findViewById(R.id.button_login);
        logB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        Toast.makeText(Login.this, "login! 친구목록을 표시합니다", Toast.LENGTH_LONG).show();

        Intent i;
        i = new Intent(this, List.class);
        startActivity(i);

    }

}


