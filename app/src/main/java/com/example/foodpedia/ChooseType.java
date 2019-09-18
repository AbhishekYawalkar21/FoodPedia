package com.example.foodpedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

public class ChooseType extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;
    TextView textView;
    ListView lv;
    CustomAdapter adapter;
    Spinner spinner1;
    ArrayList<Dishes> arrayList=new ArrayList<Dishes>();
    String[] indian_names,chinese_names,mexican_names,vietnamese_names,greek_names,italian_names,thai_names,japanese_names,spanish_names,french_names,portuguese_names,korean_names,swedish_names,aus_names,american_names,german_names,russian_names,egyptian_names;
    int[] indian_imgs,chinese_imgs,mexican_imgs,vietnamese_imgs,greek_imgs,italian_imgs,thai_imgs,japanese_imgs,spanish_imgs,french_imgs,portuguese_imgs,korean_imgs,swedish_imgs,aus_imgs,american_imgs,german_imgs,russian_imgs,egyptian_imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);
        auth = FirebaseAuth.getInstance();
        MainActivity.getInstance().finish();

        textView=(TextView)findViewById(R.id.tvscdd);
        spinner1=(Spinner)findViewById(R.id.spinnerChooseType1);
        spinner1.setOnItemSelectedListener(this);
        final List<String> categories = new ArrayList<String>();
        categories.add("Select Cuisine");
        categories.add("Indian");
        categories.add("Chinese");
        categories.add("Mexican");
        categories.add("Vietnamese");
        categories.add("Greek");
        categories.add("Italian");
        categories.add("Thai");
        categories.add("Japanese");
        categories.add("Spanish");
        categories.add("French");
        categories.add("Portuguese");
        categories.add("Korean");
        categories.add("Swedish");
        categories.add("Australian");
        categories.add("American");
        categories.add("German");
        categories.add("Russian");
        categories.add("Egyptian");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
        lv=(ListView)findViewById(R.id.lsv);

        indian_names=new String[]{"Chicken Kori Roti / Mangalorean Chicken Curry","Biryani With Goat Meat","Punjabi Lemon Chicken","Dum Aloo Lakhnavi","Karimeen (Pearl Spot) Fry","Thayir Sadam (Curd Rice)","Bhindi Masala","Methi Pulao","Malai Kofta with Spicy Gravy","Bread Upma"};
        indian_imgs=new int[]{R.drawable.indianckkrnv,R.drawable.indianbrgmnv,R.drawable.indianplchknv,R.drawable.indiandalv,R.drawable.indiankpsfnv,R.drawable.indiantscrv,R.drawable.indianbmv,R.drawable.indianmpv,R.drawable.indianmkwsgv,R.drawable.indianbuv};

        chinese_names=new String[]{"Dim Sums","Stir Fried Tofu with Rice","Peri Peri Chicken Satay","Chilli Fish","Vegetable Chow Mein","Chilli Crab In Black Bean Sauce","Spinach-and-Pork Wontons","Sichuan Chicken Wings","Sweet & Sour Chicken","Festive Golden Five-Spice Chicken"};
        chinese_imgs=new int[]{R.drawable.chinesedsnv,R.drawable.chinesesftwrv,R.drawable.chineseppcsnv,R.drawable.chinesecfnv,R.drawable.chinesevcv,R.drawable.chineseccibbsnv,R.drawable.chinesesapwnv,R.drawable.chinesescwnv,R.drawable.chinesesascnv,R.drawable.chinesefgfscnv};

        mexican_names=new String[]{"Bean Burrito Casserole","Bean Enchiladas","Chicken, Chili, and Cheese Quesadillas","Crispy Chicken Mini-Tacos","Chicken Chilaquiles","Mexican Chicken Stew with Quinoa & Beans","Spicy Black Beans and Yellow Rice","Spicy Seafood Stew with Tomatoes & Lime"};
        mexican_imgs=new int[]{R.drawable.mexicanbbcv,R.drawable.mexicanbev,R.drawable.mexicancccqnv,R.drawable.mexicanccmtnv,R.drawable.mexicanccnv,R.drawable.mexicanmcswqbnv,R.drawable.mexicansbbyrv,R.drawable.mexicanssstlnv};

        vietnamese_names=new String[]{"Vietnamese Pork Chops with Ginger Rice","Grilled Vietnamese Chicken Sandwiches"};
        vietnamese_imgs=new int[]{R.drawable.vietnamesepcgrnv,R.drawable.vietnamesegvcsnv};

        greek_names=new String[]{"Spanakopita (Greek Spinach Pie)","Garides Saganaki (Shrimp with Tomatoes and Feta)"};
        greek_imgs=new int[]{R.drawable.greeksgspv,R.drawable.greekgsstfnv};

        italian_names=new String[]{"Italian Chicken Cacciatore"};
        italian_imgs=new int[]{R.drawable.italianccnv};

        thai_names=new String[]{"Thai Peanut Chicken and Noodles"};
        thai_imgs=new int[]{R.drawable.thaipcnnv};

        japanese_names=new String[]{"Gyoza"};
        japanese_imgs=new int[]{R.drawable.japanesegnv};

        spanish_names=new String[]{"Pontevedra-Style Spanish Chicken"};
        spanish_imgs=new int[]{R.drawable.spanishpsscnv};

        french_names=new String[]{"Chicken Cordon Bleu I"};
        french_imgs=new int[]{R.drawable.frenchccbinv};

        portuguese_names=new String[]{"Mike's Portuguese Tuna Rice Casserole"};
        portuguese_imgs=new int[]{R.drawable.portuguesemptrcnv};

        korean_names=new String[]{"Authentic Korean Bulgogi"};
        korean_imgs=new int[]{R.drawable.koreanakbnv};

        swedish_names=new String[]{"Hasselback Potatoes"};
        swedish_imgs=new int[]{R.drawable.swedishhpv};

        aus_names=new String[]{"Aussie Lime Pie"};
        aus_imgs=new int[]{R.drawable.australianalpv};

        american_names=new String[]{"Apple Crumb Pie"};
        american_imgs=new int[]{R.drawable.americanacpv};

        german_names=new String[]{"German Spaetzle Dumplings"};
        german_imgs=new int[]{R.drawable.germangsdnv};

        russian_names=new String[]{"Russian Pelmeni"};
        russian_imgs=new int[]{R.drawable.russianrpnv};

        egyptian_names=new String[]{"Egyptian Meatballs"};
        egyptian_imgs=new int[]{R.drawable.egyptianmnv};

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        if (position==0)
        {
            textView.setVisibility(View.VISIBLE);
            arrayList.clear();
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==1)
        {
            arrayList.clear();
            for (int i=0; i<indian_names.length; i++)
            {
                Dishes dishes=new Dishes(indian_names[i], indian_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==2)
        {
            arrayList.clear();
            for (int i=0; i<chinese_names.length; i++)
            {
                Dishes dishes=new Dishes(chinese_names[i], chinese_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==3)
        {
            arrayList.clear();
            for (int i=0; i<mexican_names.length; i++)
            {
                Dishes dishes=new Dishes(mexican_names[i], mexican_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==4)
        {
            arrayList.clear();
            for (int i=0; i<vietnamese_names.length; i++)
            {
                Dishes dishes=new Dishes(vietnamese_names[i], vietnamese_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==5)
        {
            arrayList.clear();
            for (int i=0; i<greek_names.length; i++)
            {
                Dishes dishes=new Dishes(greek_names[i], greek_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==6)
        {
            arrayList.clear();
            for (int i=0; i<italian_names.length; i++)
            {
                Dishes dishes=new Dishes(italian_names[i], italian_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==7)
        {
            arrayList.clear();
            for (int i=0; i<thai_names.length; i++)
            {
                Dishes dishes=new Dishes(thai_names[i], thai_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==8)
        {
            arrayList.clear();
            for (int i=0; i<japanese_names.length; i++)
            {
                Dishes dishes=new Dishes(japanese_names[i], japanese_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==9)
        {
            arrayList.clear();
            for (int i=0; i<spanish_names.length; i++)
            {
                Dishes dishes=new Dishes(spanish_names[i], spanish_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==10)
        {
            arrayList.clear();
            for (int i=0; i<french_names.length; i++)
            {
                Dishes dishes=new Dishes(french_names[i], french_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==11)
        {
            arrayList.clear();
            for (int i=0; i<portuguese_names.length; i++)
            {
                Dishes dishes=new Dishes(portuguese_names[i], portuguese_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==12)
        {
            arrayList.clear();
            for (int i=0; i<korean_names.length; i++)
            {
                Dishes dishes=new Dishes(korean_names[i], korean_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==13)
        {
            arrayList.clear();
            for (int i=0; i<swedish_names.length; i++)
            {
                Dishes dishes=new Dishes(swedish_names[i], swedish_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==14)
        {
            arrayList.clear();
            for (int i=0; i<aus_names.length; i++)
            {
                Dishes dishes=new Dishes(aus_names[i], aus_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==15)
        {
            arrayList.clear();
            for (int i=0; i<american_names.length; i++)
            {
                Dishes dishes=new Dishes(american_names[i], american_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==16)
        {
            arrayList.clear();
            for (int i=0; i<german_names.length; i++)
            {
                Dishes dishes=new Dishes(german_names[i], german_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==17)
        {
            arrayList.clear();
            for (int i=0; i<russian_names.length; i++)
            {
                Dishes dishes=new Dishes(russian_names[i], russian_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }
        if (position==18)
        {
            arrayList.clear();
            for (int i=0; i<egyptian_names.length; i++)
            {
                Dishes dishes=new Dishes(egyptian_names[i], egyptian_imgs[i]);
                arrayList.add(dishes);
            }
            textView.setVisibility(View.INVISIBLE);
            adapter=new CustomAdapter(this,arrayList);
            lv.setAdapter(adapter);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) { }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_choose_type,menu);
        MenuItem myActionMenuItem=menu.findItem(R.id.action_search);

        SearchView searchView=(SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s))
                {
                    adapter.filter("");
                    lv.clearTextFilter();
                }
                else
                {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.item1signOut:
                auth.signOut();
                authStateListener=new FirebaseAuth.AuthStateListener() {
                    @Override
                    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                        if (firebaseAuth.getCurrentUser()==null)
                        {
                            //Toast.makeText(getApplicationContext(),"Logged Out!",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(ChooseType.this,SignIn.class));
                            finish();
                        }
                        else
                        {
                            //Toast.makeText(ChooseType.this,"Could not log out!",Toast.LENGTH_SHORT).show();
                        }
                    }
                };
                auth.addAuthStateListener(authStateListener);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}









