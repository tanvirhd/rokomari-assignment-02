/*
 * Copyright (c) 2012-2021 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package de.blinkt.openvpn.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import de.blinkt.openvpn.R;

public class StartOpenVPNActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final String EXTRA_NAME = "de.blinkt.openvpn.api.profileName";

        Intent shortcutIntent = new Intent(Intent.ACTION_MAIN);
        shortcutIntent.setClassName("de.blinkt.openvpn", "de.blinkt.openvpn.api.ConnectVPN");
        shortcutIntent.putExtra(EXTRA_NAME,"upb ssl");
        startActivity(shortcutIntent);
    }
}