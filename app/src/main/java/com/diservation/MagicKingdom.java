package com.diservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MagicKingdom extends AppCompatActivity implements Park {

    private ArrayList<String> parkNames;

    private CheckBox mainStreetVehicles;

    private CheckBox jungleCruise;
    private CheckBox carpetsAladdin;
    private CheckBox piratesCaribbean;
    private CheckBox swissFamily;
    private CheckBox enchantedTikiRoom;
    private CheckBox bigThunder;
    private CheckBox countryBear;
    private CheckBox splashMountain;
    private CheckBox tomSawyer;
    private CheckBox railroad;
    private CheckBox hallofPresidents;
    private CheckBox hauntedMansion;
    private CheckBox libertyBelle;

    private CheckBox cinderellasCastle;
    private CheckBox princeCharming;
    private CheckBox itsASmallWorld;
    private CheckBox madTeaParty;
    private CheckBox mickeysPhillarMagic;
    private CheckBox peterPan;
    private CheckBox brave;
    private CheckBox underTheSea;
    private CheckBox arielsGrotto;
    private CheckBox sevenDwarfs;
    private CheckBox winnieThePooh;
    private CheckBox barnStormer;

    private CheckBox buzzLightYear;
    private CheckBox monstersInc;
    private CheckBox stitchsGreatEscape;
    private CheckBox astroOrbiter;
    private CheckBox spaceMountain;
    private CheckBox tomorrowlandSpeedway;
    private CheckBox tomorrowlandTransit;
    private CheckBox carosouelProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_kingdom);
        setTitle("Magic Kingdom");
        instantiateCheckBoxes();

    }

    public void sendMessage(View view){

        isChecked();
        Intent intent = new Intent(MagicKingdom.this,MagicKingdomTimes.class);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("Park Names", parkNames);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    public ArrayList<String> isChecked(){


        parkNames = new ArrayList<>();

        if(mainStreetVehicles.isChecked()){
            parkNames.add("Main Street Vehicles");
        }
        if(jungleCruise.isChecked()){
            parkNames.add("Jungle Cruise");
        }
        if(carpetsAladdin.isChecked()){
            parkNames.add("Magic Carpets of Aladdin");
        }
        if(piratesCaribbean.isChecked()){
            parkNames.add("Pirates of the Caribbean");
        }
        if(swissFamily.isChecked()){
            parkNames.add("Swiss Family Treehouse");
        }
        if(enchantedTikiRoom.isChecked()){
            parkNames.add("Enchanted Tiki Room");
        }
        if(bigThunder.isChecked()){
            parkNames.add("Big Thunder Mountain Railroad");
        }
        if(countryBear.isChecked()){
            parkNames.add("Country Bear Jamboree");
        }
        if(splashMountain.isChecked()){
            parkNames.add("Splash Mountain");
        }
        if(tomSawyer.isChecked()){
            parkNames.add("Tom Sawyer Island");
        }
        if(railroad.isChecked()){
            parkNames.add("Disney Railroad");
        }
        if(hallofPresidents.isChecked()){
            parkNames.add("Hall of Presidents");
        }
        if(hauntedMansion.isChecked()){
            parkNames.add("Haunted Mansion");
        }
        if(libertyBelle.isChecked()){
            parkNames.add("Liberty Belle");
        }
        if(cinderellasCastle.isChecked()){
            parkNames.add("Cinderellas Castle");
        }
        if(princeCharming.isChecked()){
            parkNames.add("Prince Charming Carousel");
        }
        if(itsASmallWorld.isChecked()){
            parkNames.add("It's a Small World");
        }
        if(madTeaParty.isChecked()){
            parkNames.add("Mad Tea Party");
        }
        if(mickeysPhillarMagic.isChecked()){
            parkNames.add("Mickey's Phillar Magic");
        }
        if(peterPan.isChecked()){
            parkNames.add("Peter Pan's Flight");
        }
        if(brave.isChecked()){
            parkNames.add("Brave");
        }
        if(underTheSea.isChecked()){
            parkNames.add("Under the Sea");
        }
        if(arielsGrotto.isChecked()){
            parkNames.add("Ariel's Grotto");
        }
        if(sevenDwarfs.isChecked()){
            parkNames.add("Seven Dwarf's Mine Train");
        }
        if(winnieThePooh.isChecked()){
            parkNames.add("Winnie the Pooh");
        }
        if(buzzLightYear.isChecked()){
            parkNames.add("Buzz Light Year");
        }
        if(monstersInc.isChecked()){
            parkNames.add("Monster's Inc Laugh House");
        }
        if(stitchsGreatEscape.isChecked()){
            parkNames.add("Stitch's Great Escape");
        }
        if(astroOrbiter.isChecked()){
            parkNames.add("Astro Orbiter");
        }
        if(spaceMountain.isChecked()){
            parkNames.add("Space Mountain");
        }
        if(tomorrowlandSpeedway.isChecked()){
            parkNames.add("Tomorrowland Speedway");
        }
        if(tomorrowlandTransit.isChecked()){
            parkNames.add("Tomorrowland Transit");
        }
        if(carosouelProgress.isChecked()){
            parkNames.add("Carousel of Progress");
        }




        return parkNames;
    }

    public void instantiateCheckBoxes(){

        mainStreetVehicles = (CheckBox)findViewById(R.id.msv);
        jungleCruise = (CheckBox)findViewById(R.id.jc);
        carpetsAladdin = (CheckBox)findViewById(R.id.tmc);
        piratesCaribbean = (CheckBox)findViewById(R.id.potc);
        swissFamily = (CheckBox)findViewById(R.id.sft);
        enchantedTikiRoom = (CheckBox)findViewById(R.id.wdetr);
        bigThunder = (CheckBox)findViewById(R.id.btmr);
        countryBear = (CheckBox)findViewById(R.id.cbj);
        splashMountain = (CheckBox)findViewById(R.id.smo);
        tomSawyer = (CheckBox)findViewById(R.id.ts);
        railroad = (CheckBox)findViewById(R.id.wdwr);
        hallofPresidents = (CheckBox)findViewById(R.id.thop);
        hauntedMansion = (CheckBox)findViewById(R.id.thm);
        libertyBelle = (CheckBox)findViewById(R.id.lbr);

        cinderellasCastle = (CheckBox)findViewById(R.id.cc);
        princeCharming = (CheckBox)findViewById(R.id.pcrc);
        itsASmallWorld = (CheckBox)findViewById(R.id.iasw);
        madTeaParty = (CheckBox)findViewById(R.id.mtp);
        mickeysPhillarMagic = (CheckBox)findViewById(R.id.mpm);
        peterPan = (CheckBox)findViewById(R.id.ppf);
        brave = (CheckBox)findViewById(R.id.brave);
        underTheSea = (CheckBox)findViewById(R.id.uts);
        arielsGrotto = (CheckBox)findViewById(R.id.ag);
        sevenDwarfs = (CheckBox)findViewById(R.id.sdmt);
        winnieThePooh = (CheckBox)findViewById(R.id.wtp);
        //barnStormer = (CheckBox)findViewById(R.id.);

        buzzLightYear = (CheckBox)findViewById(R.id.bl);
        monstersInc = (CheckBox)findViewById(R.id.milf);
        stitchsGreatEscape = (CheckBox)findViewById(R.id.sge);
        astroOrbiter = (CheckBox)findViewById(R.id.ao);
        spaceMountain = (CheckBox)findViewById(R.id.sm);
        tomorrowlandSpeedway = (CheckBox)findViewById(R.id.tsw);
        tomorrowlandTransit = (CheckBox)findViewById(R.id.tta);
        carosouelProgress = (CheckBox)findViewById(R.id.cop);





    }



}
