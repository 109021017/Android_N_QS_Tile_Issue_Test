package com.willme.qstiletest;

import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

/**
 * Created by Wen on 5/21/16.
 */
public class CompareTile extends TileService {

    @Override
    public int onTileAdded() {
        int tileMode = TILE_MODE_ACTIVE;
        String modeName = "TILE_MODE_ACTIVE";
        Log.log("CompareTile onTileAdded return "+tileMode +": " +modeName);
        return tileMode;
    }

    @Override
    public void onStartListening() {
        Log.log("CompareTile onStartListening");
        getQsTile().setState(Tile.STATE_ACTIVE);
        getQsTile().updateTile();
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        Log.log("CompareTile onStopListening");
        super.onStopListening();
    }

}
