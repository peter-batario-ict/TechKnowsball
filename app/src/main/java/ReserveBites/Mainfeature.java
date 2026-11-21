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

        // LOGOUT BUTTONS (button21 and optional button33) -> return to Login.java
        Button btnLogout1 = findViewById(R.id.button21);
        if (btnLogout1 != null) {
            btnLogout1.setOnClickListener(v -> performLogout());
        }

        int button33Id = getResources().getIdentifier("button33", "id", getPackageName());
        if (button33Id != 0) {
            Button btnLogout2 = findViewById(button33Id);
            if (btnLogout2 != null) {
                btnLogout2.setOnClickListener(v -> performLogout());
            }
        }

        // BOTTOM NAVIGATION BUTTONS
        Button btnNavDashboard = findViewById(R.id.button27);
        Button btnNavExplore = findViewById(R.id.button26);
        Button btnNavReservations = findViewById(R.id.button25);
        Button btnNavFavorites = findViewById(R.id.button24);
        Button btnNavProfile = findViewById(R.id.button23);

        // DASHBOARD (button27) -> opens Dashboard.java
        if (btnNavDashboard != null) {
            btnNavDashboard.setOnClickListener(v -> {
                Intent intent = new Intent(Mainfeature.this, Dashboard.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            });
        }

        // EXPLORE (button26)
        if (btnNavExplore != null) {
            btnNavExplore.setOnClickListener(v ->
                    Toast.makeText(Mainfeature.this, "Explore selected!", Toast.LENGTH_SHORT).show()
            );
        }

        // RESERVATIONS (button25)
        if (btnNavReservations != null) {
            btnNavReservations.setOnClickListener(v ->
                    Toast.makeText(Mainfeature.this, "Reservations selected!", Toast.LENGTH_SHORT).show()
            );
        }

        // FAVORITES (button24) -> opens FavoritesActivity.java
        if (btnNavFavorites != null) {
            btnNavFavorites.setOnClickListener(v -> {
                Intent intent = new Intent(Mainfeature.this, FavoritesActivity.class);
                startActivity(intent);
                finish();
            });
        }

        // PROFILE (button23) -> stays on Mainfeature.java
        if (btnNavProfile != null) {
            btnNavProfile.setOnClickListener(v ->
                    Toast.makeText(
                            Mainfeature.this,
                            "You are on Profile",
                            Toast.LENGTH_SHORT
                    ).show()
            );
        }
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

        // Clear activity stack so user cannot return using Back button
        intent.setFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK
        );

        startActivity(intent);
        finish();
    }
}
