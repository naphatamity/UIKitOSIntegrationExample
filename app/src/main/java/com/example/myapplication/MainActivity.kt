package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amity.socialcloud.sdk.AmityCoreClient
import com.amity.socialcloud.uikit.community.home.activity.AmityCommunityHomePageActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AmityCoreClient.setup("apikey")
        authenticate()
    }

    fun authenticate() {
        AmityCoreClient.login(userId = "Farrari")
            .displayName(displayName = "Farrari") // optional
            .authToken(authToken = "token") // optional
            .build()
            .submit()
            .doOnComplete {
                //success
                val intent = Intent(this, AmityCommunityHomePageActivity::class.java)
                startActivity(intent)
            }
            .subscribe()
    }
}