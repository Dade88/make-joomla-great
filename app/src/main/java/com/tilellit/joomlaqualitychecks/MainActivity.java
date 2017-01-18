package com.tilellit.joomlaqualitychecks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button installation = (Button)findViewById(R.id.installation);
        Button general = (Button)findViewById(R.id.general);
        Button security = (Button)findViewById(R.id.security);
        Button adv_security = (Button)findViewById(R.id.adv_security);
        Button seo = (Button)findViewById(R.id.seo);
        Button cache = (Button)findViewById(R.id.cache);

        installation.setOnClickListener(this);
        general.setOnClickListener(this);
        security.setOnClickListener(this);
        adv_security.setOnClickListener(this);
        seo.setOnClickListener(this);
        cache.setOnClickListener(this);
    }

    private void installationClick()
    {
        startActivity(new Intent("android.intent.action.SECURITY"));
    }

    private void generalClick()
    {
        startActivity(new Intent("android.intent.action.GENERAL"));
    }

    private void securityClick()
    {
        startActivity(new Intent("android.intent.action.SECURITY"));
    }

    private void adv_securityClick()
    {
        startActivity(new Intent("android.intent.action.SECURITY"));
    }

    private void seoClick()
    {
        startActivity(new Intent("android.intent.action.SECURITY"));
    }

    private void cacheClick()
    {
        startActivity(new Intent("android.intent.action.SECURITY"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.installation:
                installationClick();
                break;
            case R.id.general:
                generalClick();
                break;
            case R.id.security:
                securityClick();
                break;
            case R.id.adv_security:
                adv_securityClick();
                break;
            case R.id.seo:
                seoClick();
                break;
            case R.id.cache:
                cacheClick();
                break;
        }
    }
}
