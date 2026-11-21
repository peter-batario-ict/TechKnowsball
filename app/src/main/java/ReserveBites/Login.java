package ReserveBites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationtechknowsball.R;

public class Login extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main), (v, insets) -> {

                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                });

        editTextEmail = findViewById(R.id.editTextTextEmailAddress3);
        editTextPassword = findViewById(R.id.editTextNumberPassword2);
        buttonLogin = findViewById(R.id.button4);

        // Login button (button4) navigates to Dashboard.java
        if (buttonLogin != null) {
            buttonLogin.setOnClickListener(v -> navigateToDashboard());
        }

        // Google Login button (button12) is DISPLAY ONLY.
        // No click listener is assigned so it does not navigate anywhere.
    }

    private void navigateToDashboard() {
        Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Login.this, Dashboard.class);
        startActivity(intent);
        finish();
    }
}
