package ReserveBites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplicationtechknowsball.R;

public class Mainfeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainfeature);

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
                }
        );

        // LOGOUT BUTTONS
        Button btnLogout1 = findViewById(R.id.button21);

        btnLogout1.setOnClickListener(v -> performLogout());

        // BOTTOM NAVIGATION
        Button btnNavDashboard = findViewById(R.id.button27);
        Button btnNavFavorites = findViewById(R.id.button24);
        Button btnNavProfile = findViewById(R.id.button23);

        // DASHBOARD
        btnNavDashboard.setOnClickListener(v -> {
            Intent intent = new Intent(
                    Mainfeature.this,
                    Dashboard.class
            );
            startActivity(intent);
            finish();
        });

        // FAVORITES
        btnNavFavorites.setOnClickListener(v -> {
            Intent intent = new Intent(
                    Mainfeature.this,
                    FavoritesActivity.class
            );
            startActivity(intent);
            finish();
        });

        // PROFILE
        btnNavProfile.setOnClickListener(v ->
                Toast.makeText(
                        Mainfeature.this,
                        "You are on Profile",
                        Toast.LENGTH_SHORT
                ).show()
        );
    }

    private void performLogout() {

        Toast.makeText(
                this,
                "Logged out successfully",
                Toast.LENGTH_SHORT
        ).show();

        Intent intent = new Intent(
                Mainfeature.this,
                Login.class
        );

        intent.setFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK
        );

        startActivity(intent);
        finish();
    }
}
