package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    TextView tvUsername;
    ImageView imgSetting, imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        // Giữ phần inset (EdgeToEdge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Ánh xạ view
        tvUsername = findViewById(R.id.tvUsername);
        imgSetting = findViewById(R.id.imgSetting);
        imgBack = findViewById(R.id.imgBack);

        // Nhận dữ liệu từ Login
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        if (username != null && !username.isEmpty()) {
            tvUsername.setText(username);
        }

        // Khi nhấn Setting → Quay lại Login và xóa các Activity trước đó
        imgSetting.setOnClickListener(v -> {
            Intent backIntent = new Intent(ProfileActivity.this, MainActivity.class);
            // 🔹 Thêm dòng này: xóa toàn bộ stack Activity để không quay lại Profile
            backIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(backIntent);
            // 🔹 Đóng ProfileActivity hiện tại
            finish();
        });

        // Khi nhấn Back → Thoát Activity hiện tại
        imgBack.setOnClickListener(v -> finish());
    }
}
