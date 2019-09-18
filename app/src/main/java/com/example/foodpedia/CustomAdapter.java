package com.example.foodpedia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CustomAdapter extends BaseAdapter {

        Context mContext;
        LayoutInflater inflater;
        List<Dishes> modellist;
        ArrayList<Dishes> arrayList;

        public CustomAdapter(Context context, List<Dishes> modellist){
            this.mContext=context;
            this.modellist=modellist;
            inflater=LayoutInflater.from(mContext);
            this.arrayList=new ArrayList<Dishes>();
            this.arrayList.addAll(modellist);
        }

        public class ViewHolder{
            TextView textView;
            ImageView imageView;
        }


        @Override
        public int getCount() {
            return modellist.size();
        }

        @Override
        public Object getItem(int i) {
            return modellist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {
            ViewHolder holder;
            if (view==null)
            {
                holder=new ViewHolder();
                view=inflater.inflate(R.layout.row_layout,null);

                holder.textView=view.findViewById(R.id.tv1);
                holder.imageView=view.findViewById(R.id.img1);

                view.setTag(holder);
            }

            else
            {
                holder=(ViewHolder)view.getTag();
            }
            holder.textView.setText(modellist.get(position).getDname());
            holder.imageView.setImageResource(modellist.get(position).getDimg());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (modellist.get(position).getDname().equals("Chicken Kori Roti / Mangalorean Chicken Curry"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "yTNitGNxtiU");
                        intent.putExtra("recipe", "chicken kori rotti | mangalorean chicken curry\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 kg Chicken ((Curry Cut))\n" +
                                "2 tablespoons Ghee\n" +
                                "1 + 1 Onion (Large , sliced)\n" +
                                "3/4 cup Coconut (Grated)\n" +
                                "1 lime (sized Tamarind ball)\n" +
                                "1/2 inch Turmeric (whole (See Note 1))\n" +
                                "1 tablespoon Coriander (Whole (Dhaniya) seeds)\n" +
                                "1 teaspoon Peppercorns ((Kali Mirch))\n" +
                                "1/2 teaspoon Fenugreek ((Methi) seeds)\n" +
                                "1 teaspoon Cumin ((Jeera) seeds)\n" +
                                "1 pod Garlic (, peeled (See Note 2))\n" +
                                "8 Chilies (short Red (spicy variety))\n" +
                                "12 Chilies (Kashmiri Red (more colour, less spice))\n" +
                                "3/4 cup Coconut Milk ((See Note 3) thin)\n" +
                                "1/2 cup Coconut Milk (thick)\n" +
                                "to taste Salt\n" +
                                "Curry Leaves ((optional))\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. In a pan, heat a tablespoon of ghee and add one sliced onion, grated coconut, tamarind and turmeric. Fry for 8-10 minutes till the coconut and onions start turning slightly brown and toasty.\n\n" +
                                "2. In another pan, dry roast coriander, pepper, fenugreek, cumin, garlic and both types of chilies, till you get a slightly sweetish, spicy smell. This should take about 5 minutes. Be careful to roast on a low flame so as not to burn the spices.\n\n" +
                                "3. Once cooled, grind the coconut mixture and the spice mixture together with some water into a smooth paste.\n\n" +
                                "4. In a large pot, pour the ground masala or mixture, add thin coconut milk and the remaining sliced onions. Bring this to a boil and add the chicken pieces and salt.\n\n" +
                                "5. Simmer the curry till chicken is cooked (this takes about 35-40 mins). Mix in the thick coconut milk. Stir once and switch off the flame. Top with a tablespoon of ghee and serve hot with rottis, rice and mangaloreanfish fry.\n\n" +
                                "\n" +
                                "NOTES\n" +
                                "Note 1: If you don’t have whole turmeric, substitute with 3/4 teaspoon turmeric powder\n" +
                                "\n" +
                                "Note 2: If you are using pre-peeled garlic, use 10 – 12 cloves\n" +
                                "\n" +
                                "Note 3: Most packaged coconut milk is first pressing or thick coconut milk. To make thin coconut milk from it, add half water and half coconut milk for one cup thin coconut milk.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Biryani With Goat Meat"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "0sAT8Gvm0Cs");
                        intent.putExtra("recipe", "Biryani with Goat Meat\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 1/4 lbs. (1 kg.) goat meat (use leg and get the butcher to cut it into bite-sized chunks)\n" +
                                "2 tbsp. garlic paste\n" +
                                "2 tbsp. ginger paste\n" +
                                "6 tbsp. sunflower, canola or vegetable oil (divided)\n" +
                                "2 large red onions (chopped fine)\n" +
                                "30 to 40 curry leaves\n" +
                                "2 green chilies (optional)\n" +
                                "2 tbsp. coriander powder\n" +
                                "1 tbsp. cumin powder\n" +
                                "1/2 tsp turmeric powder\n" +
                                "1 tbsp garam masala\n" +
                                "Salt to taste\n" +
                                "2 cups hot water (divided)\n" +
                                "1 3/4 oz. (50 g.) ball of tamarind\n" +
                                "3 cups (700 g.) basmati rice\n" +
                                "2 large onions (sliced thin, for garnish)\n" +
                                "2 drops orange food coloring (optional, but it makes the biryani look very pretty)\n" +
                                "2 drops green food coloring (optional)\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Put the goat meat and garlic and ginger pastes in a large bowl and mix well to coat the meat with the pastes. Set aside for 20 minutes.\n\n" +
                                "2. While the meat is marinating, heat 3 tablespoons cooking oil in a large, deep pot or pan over medium heat. Add the finely chopped onions and fry until translucent.\n\n" +
                                "3. Add the curry leaves and green chilies, if using, and fry for 1 minute.\n\n" +
                                "4. Add the powdered spices (coriander, cumin, turmeric and garam masala) and salt to taste and mix well and cook for 2 to 3 minutes. Stir often to prevent burning.Add the marinated meat. Stir well and often and cook until the meat is browned.\n\n" +
                                "5. Add 1 1/2 cups of hot water, stir, cover and simmer until meat is tender. Keep checking at this stage as you do not want the meat overcooked and soft.\n\n" +
                                "6. While the meat is cooking, make the tamarind puree: put the tamarind in a plastic or glass bowl and pour 1/2 cup of hot water over it. Allow to stand for 5 to 10 minutes. Strain the tamarind and water mixture through a sieve (do not use a very fine sieve) into a bowl to get tamarind puree. Add this to the curry when you feel the meat is almost done. Stir well. Once the meat is cooked, set it aside and prepare the rice.\n\n" +
                                "7. Put the rice in a colander and wash under running water until the water runs clear. Place in a large, deep cooking pot (preferably one with handles).\n\n" +
                                "8. Add enough water to fully cover the rice--at least 4 inches over the surface of the rice. Add 1 teaspoon of salt (or to taste). Bring the rice to a boil. Cook until almost done. (To determine when it has reached that stage, remove a few grains from the pot and press between your thumb and forefinger. The rice should mostly mash but will have a firm, whitish core.) Turn off the heat and strain through a colander and set aside.\n\n" +
                                "9. Heat 3 tablespoons of oil in a pan and fry the thinly sliced onions until caramelized and golden brown. Drain and set aside on paper towels for later use.\n\n" +
                                "10. If you are using the food coloring, divide the rice into 3 equal portions and put into separate dishes. Add the orange food coloring to one portion of the rice and the green food coloring to another portion of the rice. Leave the third portion white. With each portion, mix the rice until all the grains are well colored. Set aside for 10 minutes and then mix all 3 portions of rice together in a bowl.\n\n" +
                                "11. Preheat the oven or grill to 350 F (180 C) and grease a deep dish or pot (which has a nicely fitting cover). Evenly layer the cooked rice and the meat (with its gravy) in the dish to form at least 2 sets of layers (rice-meat-rice-meat-rice). Garnish with the caramelized onions. Cover the dish tightly. If your dish does not have a cover use 2 layers of aluminum foil (shiny side of both layers facing down toward the rice) and secure onto dish with baking string. If you are using a handi (a deep pot with a nicely fitting lid) which has a flat rim, you can seal it by making a firm dough with flour and water and pressing this over the joint of the handi's rim and cover.\n\n" +
                                "12. Place the dish in oven or grill and cook for 20 minutes.\n\n" +
                                "13. Turn off the oven or barbecue and let the dish sit in the oven or barbecue until you are ready to eat--it's important that you only open when you are ready to serve. The way to serve biryani is to gently dig in with a spoon so you get through the layers.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Punjabi Lemon Chicken"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "gDQ9ThjKRJ8");
                        intent.putExtra("recipe", "Punjabi Lemon Chicken\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "6 Chicken thighs (without skin)\n" +
                                "For the base:\n" +
                                "3-4 Tbsp Refined oil\n" +
                                "2 tsp Cumin seeds\n" +
                                "2 Onions, julienne\n" +
                                "6 Garlic cloves, chopped\n" +
                                "1/2 inch Ginger, chopped\n" +
                                "3-4 Hot green chillies\n" +
                                "3/4 tsp Turmeric powder\n" +
                                "1 tsp Coriander powder\n" +
                                "To taste Salt\n" +
                                "1 Cup Fresh lemon juice\n" +
                                "1/2 Cup Orange juice\n" +
                                "1/4 Fresh sugarcane juice\n" +
                                "To garnish Fresh coriander\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat a heavy cooking vessel on a high heat and once its hot, add the refined oil and swirl the pan to coat the base evenly. Once the oil is nice and hot, add the cumin seeds and saute them until crackling and fragrant.\n\n" +
                                "2. Now add the onions, garlic and ginger and sauté them gently until they take on a light golden brown color. Turn up the heat and then add the spice powders.\n\n" +
                                "3. Toast the spices on a high heat until they are intensely aromatic and well toasted. Then add a little water and bhuno the base ingredients repeatedly until the oil rises to the top and the masala is well cooked out.\n\n" +
                                "4. Add some salt and mix well, then add the chicken thighs to the pan. Turn up the heat and fry the chicken in the masala until it is evenly coated with the flavor of the base and is a very light yellowy golden brown in color.\n\n" +
                                "5. Now add the lemon and orange juice to the chicken and deglaze the pan well, scraping up the flavor packed pan deposits on the base of the pan.\n\n" +
                                "6. Stir everything together well to combine, then add a little sugarcane juice to balance the acidity of the lemon juice.\n\n" +
                                "7. Bring the chicken to a boil, then turn the heat to low, cover the pan and let the chicken simmer away until it is cooked to perfection and almost falling off the bone.\n\n" +
                                "8. Once the chicken is cooked, uncover the pan and simmer the light gravy until slightly reduced and concentrated in flavor. Turn off the heat, then garnish with fresh coriander and serve with hot rotis or rice.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Dum Aloo Lakhnavi"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "1UyV5wfg34U");
                        intent.putExtra("recipe", "Dum Aloo Lakhnavi\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1/2 Kg Potatoes\n" +
                                "100 Gram Potatoes, mashed\n" +
                                "100 Gram Crumbled paneer\n" +
                                "1 tsp Red chilli powder and salt\n" +
                                "1 tsp Garam masala\n" +
                                "1 1/2 tsp Kasoori methi\n" +
                                "3 Tbsp Ghee\n" +
                                "1 Tbsp Butter\n" +
                                "1 Tbsp Cream\n" +
                                "For the onion gravy:\n" +
                                "200 Gram Onions\n" +
                                "1/2 tsp Garam masala\n" +
                                "To taste Salt\n" +
                                "1 tsp Ghee\n" +
                                "For the tomato gravy:\n" +
                                "200 Gram Fresh tomato puree\n" +
                                "To taste Salt\n" +
                                "1 tsp Ghee\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "Prepare onion gravy:\n" +
                                "1. Heat some ghee in a pan and saute all the ingredients. The onions should be nice and glossy. Keep aside.\n\n" +
                                "Prepare tomato gravy:\n\n" +
                                "1. In another pan, heat some ghee and cook all the ingredients for a couple of minutes. Keep aside.\n\n" +
                                "Prepare the potatoes:\n\n" +
                                "1. Cut out the cores of the potatoes and deep fry the potatoes.\n\n" +
                                "2. While the potatoes cool down make the filling. Mix the mashed potatoes and paneer together. This is the filling.\n\n" +
                                "3. Stuff the fried potatoes with the filling and keep aside.\n\n" +
                                "Prepare the final preparation:\n\n" +
                                "1. Cook the onion and tomato gravies in oil until the oil separates.\n\n" +
                                "2. Add all the garama masala, chilli powder and kasoori methi. Mix. Cook for 1 minute.\n\n" +
                                "3. Stir in the butter and the cream. Mix well.\n\n" +
                                "4. Finally, add the potatoes and simmer for about 3-5 minutes.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Karimeen (Pearl Spot) Fry"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "1cazHF0EH7w");
                        intent.putExtra("recipe", "Karimeen (Pearl Spot) Fry\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 nos karimeen\n" +
                                "1/2 teaspoon kashmiri chili powder\n" +
                                "1 chili powder red table spoon\n" +
                                "1/2 teaspoon turmeric powder\n" +
                                "1/4 teaspoon pepper powder\n" +
                                "1/4 teaspoon fennel powder\n" +
                                "1/2 teaspoon ginger garlic paste\n" +
                                "1 teaspoon maida\n" +
                                "2 teaspoons lime juice\n" +
                                "salt as needed\n" +
                                "oil as needed\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Clean karimeen well with salt and water.\n\n" +
                                "2. Make small slits on the fish.\n\n" +
                                "3. Marinate the fish pieces with salt and lemon juice keep aside.\n\n" +
                                "4. Mix all other ingredients well except oil.\n\n" +
                                "5. Apply this paste on karimeen and keep aside for 30 minutes.\n\n" +
                                "6. Heat oil in a pan and deep fry karimeen in both sides\n\n" +
                                "7. Serve hot with onion rings and lemon wedges.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Thayir Sadam (Curd Rice)"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "Kv5l0J8UvbE");
                        intent.putExtra("recipe", "Thayir Sadam (Curd Rice)\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 Cup Rice\n" +
                                "3 Cups Water\n" +
                                "1 1/2 Cup Curd\n" +
                                "1/2 Cup Milk\n" +
                                "1 Carrot\n" +
                                "1 Green Chilli\n" +
                                "1 tsp Ginger\n" +
                                "1 tsp Salt\n" +
                                "1 Bunch Coriander Leaves\n" +
                                "2 tsp Oil\n" +
                                "2 tsp Mustard Seeds\n" +
                                "1 tsp Chana Dal\n" +
                                "2 tsp Urad Dal\n" +
                                "2 Bunch Curry Leaves\n" +
                                "2 Red Chilli\n" +
                                "1/2 tsp Hing\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Add rice and water together, and pressure cook it.\n" +
                                "\n" +
                                "2. Mix the pressure cooked rice a bit to make it soggy.\n" +
                                "\n" +
                                "3. Add curd and milk to it and mix well.\n" +
                                "\n" +
                                "4. Put carrot, green chilli, ginger, salt and coriander leaves. Stir the ingredients thoroughly.\n" +
                                "\n" +
                                "5. Now take a pan, heat and pour some oil in it.\n" +
                                "\n" +
                                "6. Add mustard seeds, chana dal, urad dal, curry leaves, red chilli and hing together to make a tadka.\n" +
                                "\n" +
                                "7. Saute them well.\n" +
                                "\n" +
                                "8. To serve, put the curd rice in a bowl and pour the tadka over it.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Bhindi Masala"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "f2iJF-FUXmU");
                        intent.putExtra("recipe", "Bhindi Masala\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "Bhindi\n" +
                                "Turmeric powder\n" +
                                "Onions\n" +
                                "Garam masala\n" +
                                "Red chili\n" +
                                "Mango powder\n" +
                                "Oil\n" +
                                "Salt\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Firstly, cut bhindi pieces lengthwise.\n" +
                                "\n" +
                                "2. Mix the bhindi pieces with spices well.\n" +
                                "\n" +
                                "3. Then cut onions and stir fry until they become brownish.\n" +
                                "\n" +
                                "4. Now add the spice soaked bhindi pieces and stir fry.\n" +
                                "\n" +
                                "5. Serve with hot rotis.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Methi Pulao"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "KZTZhyZixec");
                        intent.putExtra("recipe", "Methi Pulao\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "Basmati rice\n" +
                                "Chopped fresh fenugreek leaves\n" +
                                "Cloves and cinnamon\n" +
                                "Finely chopped onion\n" +
                                "Finely chopped chilli\n" +
                                "Ginger-garlic paste\n" +
                                "Salt to taste\n" +
                                "Water\n" +
                                "Ghee\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Soak the rice in water.\n" +
                                "\n" +
                                "2. Heat ghee and oil together in pan and add cloves and cinnamon.\n" +
                                "\n" +
                                "3. Then add onion and sauté it before adding ginger-garlic paste and green chilli.\n" +
                                "\n" +
                                "4. Next, add chopped fenugreek leaves and stir fry.\n" +
                                "\n" +
                                "5. Pour in the drained rice and sauté for a few minutes.\n" +
                                "\n" +
                                "6. Add water and salt to the pan and stir well.\n" +
                                "\n" +
                                "7. It should be cooked for 10 minutes on low heat.\n" +
                                "\n" +
                                "8. The rice should be fluffy and it should be served hot with side dishes.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Malai Kofta with Spicy Gravy"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "M9gW93hn3SU");
                        intent.putExtra("recipe", "Malai Kofta with Spicy Gravy\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "800g potato, peeled\n" +
                                "5 tbsp plain flour\n" +
                                "2 eggs, beaten\n" +
                                "100g fine breadcrumbs\n" +
                                "oil for frying\n" +
                                "\n" +
                                "For the filling\n" +
                                "2 heaped tbsp grated paneer cheese\n" +
                                "5 cashew nuts, chopped\n" +
                                "1 tbsp raisins\n" +
                                "2-3 green chillies, finely chopped\n" +
                                "1/4 tsp sugar\n" +
                                "1 tsp each ground coriander, cumin and chilli powder\n" +
                                "1/2 tsp cardamom powder\n" +
                                "3 tbsp vegetable oil or ghee\n" +
                                "\n" +
                                "For the gravy\n" +
                                "2 medium onions, chopped\n" +
                                "3 garlic cloves, crushed\n" +
                                "large piece ginger, grated\n" +
                                "2 tsp poppy seeds, crushed to a powder\n" +
                                "1 tbsp peanut or cashew nuts\n" +
                                "3 tbsp vegetable oil\n" +
                                "3 large tomatoes, puréed\n" +
                                "1 tsp chilli powder\n" +
                                "1/2 tsp each garam masala, ground coriander, cumin and sugar\n" +
                                "flaked almond and single cream, to serve\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Boil the potatoes until tender, then drain, return to the pan and put over a low heat to steam dry for a few mins. Mash with some seasoning and cool.\n" +
                                "\n" +
                                "2. Mix all the filling ingredients together. Make 12 balls of potato. Take one, press your finger into it to make a little hole, then place a little of the filling mixture into the centre. Pinch the potato back over to seal and shape into a round. Repeat with remaining potato balls and filling. Roll each kofta in flour, dip in the beaten egg, then roll in the breadcrumbs. Fill a deep saucepan halfway with oil, and heat until a small piece of bread browns in 20 secs. Fry the koftas in batches for a few mins until golden, then set aside on kitchen paper.\n" +
                                "\n" +
                                "3. For the gravy, blend together the onions, garlic, ginger, poppy seeds and nuts in a food processor to a purée. Heat the oil, then fry the onion purée until just turning brown. Add the puréed tomatoes, spices and sugar. The gravy should be quite thick, but if you want to thin it down a bit, add a little water.\n" +
                                "\n" +
                                "4. When the gravy comes to a boil, add the koftas. Heat through and serve with a drizzle of single cream and some flaked almonds scattered on top.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Bread Upma"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "VocUzFjxO3E");
                        intent.putExtra("recipe", "Bread Upma\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "6 Slices for Bread\n" +
                                "1 Small Sized Onion\n" +
                                "1 Large Tomato\n" +
                                "1 Green Chilli\n" +
                                "2-3 Cloves of Garlic\n" +
                                "~1 inch piece of Ginger\n" +
                                "8-10 Curry Leaves (Kari Patta)\n" +
                                "1 Teaspoon Rai (Black Mustard Seeds)\n" +
                                "1 Teaspoon Cumin Seeds (Jeera)\n" +
                                "1/8 Teaspoon Asafoetida (Heeng)\n" +
                                "1/3 Teaspoon Turmeric Powder (Haldi)\n" +
                                "1/2 Teaspoon Red Chilli Powder\n" +
                                "1/2 Teaspoon Salt, or to taste\n" +
                                "1-2 Teaspoons Lemon Juice\n" +
                                "5-6 Sprigs of Coriander Leaves\n" +
                                "1 Tablespoon Oil\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat some oil in a pan or kadai. Add some Rai (Mustard Seeds) to it and let them splutter.\n" +
                                "\n" +
                                "2. Then add some Cumin Seeds (Jeera) to it and fry till they start to crackle. Also add a pinch of Asafoetida.\n" +
                                "\n" +
                                "3. Add finely chopped onions to the pan and fry them till they turn light golden brown.\n" +
                                "\n" +
                                "4. Then add a few curry leaves and fry them for a few seconds.\n" +
                                "\n" +
                                "5. Then add Ginger-Garlic paste along with finely chopped Green Chillies and fry them till they are cooked.\n" +
                                "\n" +
                                "6. Add finely chopped tomatoes and cook them till they become soft.\n" +
                                "\n" +
                                "7. Now add Salt, Turmeric Powder (Haldi) and Red Chilli Powder to the pan.\n" +
                                "\n" +
                                "8. Cut bread slices into small square pieces and add them to the pan. I have used brown bread here, but you can use any bread you like.\n" +
                                "\n" +
                                "9. Mix everything and coat the bread with the masala completely. Let it cook for 5 minutes, stirring occasionally. Sprinkle some Lemon Juice and chopped coriander leaves on top. Mix everything well.\n" +
                                "\n" +
                                "10. Bread Upma is ready. Serve it hot for Breakfast or enjoy it as a snack at any time of the day.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Dim Sums"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "v3rOKyNwxcM");
                        intent.putExtra("recipe", "Dim Sums\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "For chicken and prawn dumplings:\n" +
                                "150 gm chicken\n" +
                                "150 gm prawn\n" +
                                "5 gm sugar\n" +
                                "5 ml sesame oil\n" +
                                "2.5 gm white pepper\n" +
                                "Wanton skin\n" +
                                "Potato starch\n" +
                                "Salt\n" +
                                "\n" +
                                "For vegetable coriander dumplings:\n" +
                                "10 gm carrots\n" +
                                "10 gm button mushrooms\n" +
                                "10 gm water chestnuts\n" +
                                "10 gm bamboo shoots\n" +
                                "10 gm garlic\n" +
                                "10 ml oil\n" +
                                "10 gm brown garlic\n" +
                                "5 gm sugar\n" +
                                "5 gm sesame oil\n" +
                                "\n" +
                                "For wanton skin:\n" +
                                "Potato starch\n" +
                                "Salt\n" +
                                "50 gm wheat starch\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "For chicken and prawn dumplings:\n" +
                                "1. Mince chicken and prawns and mix with sugar, salt, sesame oil and potato starch. Stuff the mixture in the wanton skin and steam.\n" +
                                "\n" +
                                "2. Serve with Diamond & soya Sauce\n" +
                                "\n" +
                                "For vegetable coriander dumplings:\n" +
                                "1. Mix all ingredients except for wanton skin. Stuff the mixture in the wanton skin and steam.\n" +
                                "\n" +
                                "2. Serve with diamond sauce.\n" +
                                "\n" +
                                "For wanton skin:\n" +
                                "1. Add cold water with potato and 50 gm of wheat starch, and mix with a pinch of salt.\n" +
                                "\n" +
                                "2. Add hot water to the mixture and stir till it thickens. Add potato starch till it gets tight.\n" +
                                "\n" +
                                "3. Make a roll and cut into small balls adding wheat starch over the ball.\n" +
                                "\n" +
                                "4. Then roll the balls in a flat and round shape with a roller and add fillings.\n" +
                                "\n" +
                                "For diamond sauce:\n" +
                                "1. Soak 250 gm red chilies for 3 hours. Make into paste. Fry 100 gm garlic in oil.\n" +
                                "\n" +
                                "2. When garlic gets brown, add chili paste, salt, sugar and soya bean powder.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Stir Fried Tofu with Rice"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "eDAyeS-rzN4");
                        intent.putExtra("recipe", "Stir Fried Tofu with Rice\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "For the tofu:\n" +
                                "100 Tofu\n" +
                                "2 tsp Chilly paste\n" +
                                "1 stick Lemon grass\n" +
                                "2 Shallots, chopped\n" +
                                "1 inch Ginger, chopped\n" +
                                "2 tsp Soya sauce\n" +
                                "3 cloves Garlic, chopped\n" +
                                "1 inch Red onion, chopped\n" +
                                "2 tsp Honey\n" +
                                "Handful Coriander leaves, chopped\n" +
                                "1 tsp Refined oil\n" +
                                "\n" +
                                "For the fried rice:\n" +
                                "Carrots, chopped\n" +
                                "Spring onions, chopped\n" +
                                "to flavor Salt & pepper\n" +
                                "1 Fresh red chilly, chopped\n" +
                                "1 Pieces Ginger, chopped\n" +
                                "2 tsp Soya sauce\n" +
                                "1/2 A lemon squeezed\n" +
                                "Handful Coriander , chopped\n" +
                                "1 tsp Olive oil\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1.Drizzle refined oil in a preheated pan and add chopped mariner and stir well.\n" +
                                "\n" +
                                "2.Then add ginger, garlic, shallots and salt & pepper.\n" +
                                "\n" +
                                "3.Add red chilly paste, soya sauce and honey.\n" +
                                "\n" +
                                "4.Add some coriander leaves and mix it all together.\n" +
                                "\n" +
                                "For the fried rice:\n" +
                                "1.Drizzle olive oil in a pre-heated pan and add carrots, spring onions, ginger and salt & pepper.\n" +
                                "\n" +
                                "2.Then add fresh red chilly, lemon juice and soya sauce and stir all together.\n" +
                                "\n" +
                                "3.Add some chopped coriander leaves.\n" +
                                "\n" +
                                "4.Cook it away for 5-7 minutes.\n" +
                                "\n" +
                                "5.Serve it on a platter.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Peri Peri Chicken Satay"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "mmuD3Ywwuz4");
                        intent.putExtra("recipe", "Peri Peri Chicken Satay\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "200 gms boneless skinless chicken thigh (trimmed)\n" +
                                "to taste salt and pepper\n" +
                                "100 gms yogurt\n" +
                                "5 gms chilli powder\n" +
                                "25 gms ginger garlic paste\n" +
                                "5 gram coriander leaves\n" +
                                "oil to fry\n" +
                                "50 gms peri peri sauce\n" +
                                "100 gms potato fries\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1.Soak the skewers for at least 60 minutes or more totally submerged in water before using it to prevent burns. You may skip this part if pan grilling.\n" +
                                "\n" +
                                "2.Marinate thigh chicken with yogurt, chilli powder, ginger garlic paste, peri peri sauce, salt and pepper.\n" +
                                "\n" +
                                "3.Refrigerate and use when ready. You may make this a day or more ahead of time.\n" +
                                "\n" +
                                "4.Place in a zip lock bag, or sealed containers and refrigerate for at least 2 hours, preferably overnight.\n" +
                                "\n" +
                                "5.When ready to grill. Using tong remove excess marinates and reserve.\n" +
                                "\n" +
                                "6.Pre heat grill to medium- high heat.\n" +
                                "\n" +
                                "7.Place chicken over medium heat, and then brush with oil to prevent chicken from sticking. Grill for about 10 to 15 minutes, rotating from sides for even cooking. Keep an eye on it -- if they are browning too quickly, turn the heat down.\n" +
                                "\n" +
                                "8.Grill in batches if you have a small grill. Transfer the skewers to a platter.\n" +
                                "\n" +
                                "9.In a small saucepan simmer the remaining peri peri marinade and the one from the chicken for about 7 minutes.\n" +
                                "\n" +
                                "10.Serve with chicken, heat oil and prepare the potatoes fries, serve as a bed for chicken.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Chilli Fish"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "vi3IhEPhZFM");
                        intent.putExtra("recipe", "Chilli Fish\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "250 Gram Fish pieces (Boneless)\n" +
                                "1/2 Cup Maida\n" +
                                "1/2 Cup Corn flour\n" +
                                "1 tsp Baking powder\n" +
                                "2 tsp Soy sauce\n" +
                                "2 Tbsp Celery, finely chopped\n" +
                                "1 tsp Pepper\n" +
                                "Salt\n" +
                                "Oil\n" +
                                "To garnish Spring onions\n" +
                                "\n" +
                                "For the sauce:\n" +
                                "1 Tbsp Ginger, chopped\n" +
                                "1 Tbsp Garlic, chopped\n" +
                                "1 Tbsp Green chilly, chopped\n" +
                                "4 Tbsp Soy sauce\n" +
                                "5 Tbsp Tomato sauce\n" +
                                "1 Tbsp Chilli sauce\n" +
                                "1 Tbsp Corn flour\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1.Cut the fish into finger pieces.\n" +
                                "\n" +
                                "2.Make a batter with corn flour, maida, baking powder, soy sauce, celery, pepper powder, water and salt.\n" +
                                "\n" +
                                "3.Dip the fish pieces in the batter and fry in oil till golden brown. Transfer fish into a serving plate.\n" +
                                "\n" +
                                "Prepare the sauce:\n" +
                                "1.Heat oil in a pan.\n" +
                                "\n" +
                                "2.Saute garlic, ginger and green chilly. Add soy sauce, chilly and tomato sauce to it.\n" +
                                "\n" +
                                "3.Finally add corn flour mixed with water to it and stir well. Once it starts to boil, remove form fire.\n" +
                                "\n" +
                                "4.At the time of serving, pour the sauce on top of fried fish pieces and mix well.\n" +
                                "\n" +
                                "5.Garnish with chopped spring onions.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Vegetable Chow Mein"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "eTXq79uvly4");
                        intent.putExtra("recipe", "Vegetable Chow Mein\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "200 Gram Fresh noodles\n" +
                                "5 Cups Water\n" +
                                "1 tsp Salt\n" +
                                "2 Tbsp Oil\n" +
                                "1 tsp Ginger garlic paste\n" +
                                "1 tsp Chilli powder\n" +
                                "1/4 Cup Onion, sliced\n" +
                                "1/2 tsp Soy sauce\n" +
                                "1 tsp Salt\n" +
                                "1/4 Cup Celery, chopped\n" +
                                "1 tsp Vinegar\n" +
                                "1 tsp Chilli sauce\n" +
                                "1 Cup Green and red capsicum\n" +
                                "1 Cup Mushroom\n" +
                                "1 Cup Carrot, shredded\n" +
                                "1 Green chillies, chopped\n" +
                                "1 Tbsp Tomato sauce\n" +
                                "1 Tbsp Spring onion\n" +
                                "1 tsp Garlic, chopped\n" +
                                "1/2 tsp Black pepper powder\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Take water in a pan, add salt followed by olive oil and bring to boil.\n" +
                                "\n" +
                                "2. Add noodles and cook 'bite like' -- just blanch if fresh and cook longer if dry.\n" +
                                "\n" +
                                "3. Drain immediately and cool under running water till noodles are thoroughly cooled.\n" +
                                "\n" +
                                "4. Work 1 tablespoon of the oil into the noodles and leave in the colander till required.\n" +
                                "\n" +
                                "5. Keep aside a small bowl of green chilli dipped in vinegar for garnishing.\n" +
                                "\n" +
                                "6. Now, heat some oil in a heavy bottom pan and stir- fry garlic, ginger garlic paste and onions over high heat till onions are golden brown.\n" +
                                "\n" +
                                "7. Add celery and mushrooms followed by red and green capsicum along with carrot. Stir well.\n" +
                                "\n" +
                                "8. Now add salt, black pepper powder, tomato sauce, chilli sauce, soy sauce and vinegar to veggie mixture. Mix well.\n" +
                                "\n" +
                                "9. Add the noodles to this and stir well till it is thoroughly mixed.\n" +
                                "\n" +
                                "10. Garnish with red capsicum and pour the prepared green-chilli vinegar mix on top.\n" +
                                "\n" +
                                "11. Serve hot.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Chilli Crab In Black Bean Sauce"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "IsEJj_0QYGs");
                        intent.putExtra("recipe", "Chilli Crab In Black Bean Sauce\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 jumbo crab\n" +
                                "2 Tbsp chopped green pepper\n" +
                                "2 Tbsp chopped red pepper and red chillies\n" +
                                "2 Tbsp chopped spring onions\n" +
                                "2 Tbsp chopped onions\n" +
                                "2 Tbsp chopped garlic\n" +
                                "2 Tbsp chopped black beans\n" +
                                "2 Tbsp oil\n" +
                                "1 Tbsp water mixed with cornflour\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Cut and clean the crab.\n" +
                                "\n" +
                                "2. Brush a deep bottomed pan and add the oil and heat on a high flame.\n" +
                                "\n" +
                                "3. When the oil is boiling hot, add the pieces crab and fry.\n" +
                                "\n" +
                                "4. Take the pieces of crab out after 2 minutes or so.\n" +
                                "\n" +
                                "5. In the same pan, add the onions, garlic, green pepper, red pepper, chillies, and the black beans and stir for a few seconds before adding the crab.\n" +
                                "\n" +
                                "6. Continue to cook on high flame while adding a little water.\n" +
                                "\n" +
                                "7. Add about 1 tbsp of water mixed with cornflour to thicken the sauce.\n" +
                                "\n" +
                                "8. After a few minutes of sauteing, take the pan off the flame.\n" +
                                "\n" +
                                "9. Place the crab in a serving platter and dress with the sauce and serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Spinach-and-Pork Wontons"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "f-9Gyh_Fph0");
                        intent.putExtra("recipe", "Spinach-and-Pork Wontons\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 cups baby spinach, rinsed \n" +
                                "1 tablespoon plus 1 1/2 teaspoons soy sauce \n" +
                                "1 teaspoon Asian sesame oil \n" +
                                "1 teaspoon dry sherry \n" +
                                "1/4 teaspoon salt \n" +
                                "1/4 teaspoon sugar \n" +
                                "Pinch of freshly ground white pepper \n" +
                                "1/4 pound ground pork \n" +
                                "1 small scallion, minced \n" +
                                "3/4 teaspoon minced fresh ginger \n" +
                                "Cornstarch, for sprinkling \n" +
                                "30 thin wonton wrappers \n" +
                                "2 tablespoons chile oil \n" +
                                "2 tablespoons peanut oil \n" +
                                "1 small garlic clove, minced \n" +
                                "2 tablespoons chopped cilantro\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. In a skillet, cook the spinach, stirring, until wilted; transfer to a colander and squeeze dry. Finely chop the spinach.\n" +
                                "\n" +
                                "2. In a bowl, combine 1 1/2 teaspoons of the soy sauce, the sesame oil, sherry, salt, sugar and white pepper. Mix in the pork, scallion, ginger and spinach. Chill for 10 minutes.\n" +
                                "\n" +
                                "3. Dust a large baking sheet with cornstarch. Arrange 4 wonton wrappers on a work surface, keeping the other wrappers covered with plastic wrap. Brush the edges of the wrappers with water and spoon 1 teaspoon of filling in the center of each. Fold the wrappers diagonally over the filling to form triangles; seal. Bring the two opposite corners of the triangle together; press to seal. Transfer to the baking sheet and cover. Repeat.\n" +
                                "\n" +
                                "4. In a large saucepan of boiling water, simmer the wontons over moderate heat, stirring occasionally. When they float, cook for 3 minutes longer. Drain the wontons well.\n" +
                                "\n" +
                                "5. In a large bowl, combine the remaining soy sauce with the chile oil, peanut oil and garlic. Add the wontons and toss. Sprinkle with the cilantro and serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Sichuan Chicken Wings"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "-EjB1dQX-Y0");
                        intent.putExtra("recipe", "Sichuan Chicken Wings\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "800g chicken wings\n" +
                                "1 tbsp baking powder\n" +
                                "1½ tsp Sichuan peppercorns\n" +
                                "1½ tsp chilli flakes\n" +
                                "3 tbsp Shaoxing wine\n" +
                                "1½ tbsp garlic and ginger paste\n" +
                                "3 tbsp dark soy sauce\n" +
                                "3 tbsp light soy sauce\n" +
                                "1½ tsp sesame oil\n" +
                                "3 tbsp palm sugar\n" +
                                "\n" +
                                "To serve:\n" +
                                "chopped peanuts\n" +
                                "chilli flakes\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat oven to 160C/140C fan/gas 3. Toss the chicken in 1 tsp salt and the baking powder – this is the secret to getting crispy skin! Put the wings on a wire rack set over an oven tray. Bake for 30 mins, turning halfway, then turn the heat up to 220C/200C fan/gas 7 and cook for 20 mins more.\n" +
                                "\n" +
                                "2. Meanwhile, toast the peppercorns and chilli flakes until fragrant, about 2 mins, then grind using a pestle and mortar. Tip into a saucepan, then add the rest of the ingredients apart from the chopped peanuts and chilli flakes. Whisk to combine, then cook over a medium heat for 8-10 mins until thickened and bubbling. Set aside.\n" +
                                "\n" +
                                "3. Take the chicken off the rack and tip onto the tray, then coat in the glaze. Return to the oven for 5 mins until bubbling and sticky. Serve the chicken scattered with the peanuts and chilli flakes.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Sweet & Sour Chicken"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "L7i2qKw12nw");
                        intent.putExtra("recipe", "Sweet & Sour Chicken\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "sunflower or vegetable oil, for frying\n" +
                                "100ml soda water, chilled\n" +
                                "140g self-raising flour\n" +
                                "25g cornflour\n" +
                                "4 skinless, boneless chicken breasts, cut into chunks\n" +
                                "spring onions, finely shredded, to serve\n" +
                                "\n" +
                                "For the sauce\n" +
                                "1 red pepper, deseeded and chopped into chunks\n" +
                                "3 red chillies, 1 cut into chunks, 2 halved and deseeded\n" +
                                "425g can pineapple chunks, drained and juice reserved\n" +
                                "4 star anise\n" +
                                "50g tamarind paste\n" +
                                "100g caster sugar\n" +
                                "100ml rice wine vinegar or Chinese vinegar\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. For the sauce, put the red pepper, chunks of chilli and pineapple juice in a pan and bring to the boil. Cover and cook for 10 mins, then purée in a food processor. Return to the pan with the pineapple chunks, chilli halves, star anise, tamarind, sugar and vinegar. Gently simmer for 20-30 mins until reduced and sticky. Keep warm, or reheat to serve.\n" +
                                "\n" +
                                "2. Fill a large pan 1cm deep with oil and heat until shimmering. Whisk the soda water and 100ml cold water into the self-raising flour with a little salt. Tip the cornflour onto a plate, line a tray with kitchen paper and turn on the oven to low.\n" +
                                "\n" +
                                "3. Stir the batter well. Dust the chicken with cornflour, then dip into the batter. One at a time, lower into the hot oil (about 5-6 every batch). Turn up the heat to keep the chicken frying, if needed, and cook for 5-6 mins, turning once. When cooked, drain on the tray, and keep warm in the oven. Repeat with the remaining chicken. Stack onto a plate with the warm sauce on the side, and scatter with shredded spring onions.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Festive Golden Five-Spice Chicken"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "YHYFkB0OBfA");
                        intent.putExtra("recipe", "Festive golden five-spice chicken\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "8 chicken thighs and 8 drumsticks, skin on\n" +
                                "3 spring onions, shredded, to finish\n" +
                                "\n" +
                                "For the marinade\n" +
                                "4 tbsp groundnut oil\n" +
                                "6 garlic cloves, finely chopped\n" +
                                "finger-length piece fresh root ginger, grated\n" +
                                "4 tbsp Shaohsing rice wine or dry sherry\n" +
                                "4 tbsp light soy sauce\n" +
                                "4 tbsp clear honey\n" +
                                "4 tsp five spice powder\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Whisk together the marinade ingredients, put the chicken into a dish, then pour over the marinade, mixing to coat. Cover, then chill for at least 20 mins, or up to a day if you have time.\n" +
                                "\n" +
                                "2. Heat oven to 180C/fan 160C/gas 4, and lift the chicken out of the marinade into a roasting tin. Roast for 40 mins, pour over the remaining marinade, then cook for a further 30 mins until golden and sticky. Sprinkle with the spring onion, then serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Bean Burrito Casserole"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "HrwRdbrVMD8");
                        intent.putExtra("recipe", "Bean Burrito Casserole\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "6 frozen bean and cheese burritos\n" +
                                "1 (10.5 ounce) can condensed cream of chicken or cream of mushroom soup\n" +
                                "1/2 cup sour cream\n" +
                                "1 (4 ounce) can diced green chile peppers, drained\n" +
                                "1 cup shredded Cheddar cheese\n" +
                                "1 medium tomato, chopped (optional)\n" +
                                "1 avocados - peeled, pitted and sliced (optional)\n" +
                                "1 (2.25 ounce) can sliced black olives, drained (optional)\n" +
                                "1/2 cup salsa (optional)\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat the oven to 350 degrees F (175 degrees C).\n" +
                                "\n" +
                                "2. Place the burritos in a row across the bottom of a 9x13 inch baking dish. In a medium bowl, stir together the cream of chicken soup, sour cream and chile peppers. Spread evenly over the top of the burritos. Sprinkle with shredded cheese.\n" +
                                "\n" +
                                "3. Bake for 25 to 30 minutes in the preheated oven, until cheese is slightly browned and burritos are heated through. Serve with tomato, avocado, olives and salsa.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Bean Enchiladas"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "VbfnNvNBzeg");
                        intent.putExtra("recipe", "Bean Enchiladas\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 tsp olive oil\n" +
                                "2 onions, chopped\n" +
                                "280g carrots, grated\n" +
                                "2-3 tsp chilli powder (mild or hot, according to your taste)\n" +
                                "2 x 400g cans chopped tomatoes\n" +
                                "2 x 400g cans pulses in water, drained (we used mixed beans and lentils)\n" +
                                "6 small wholemeal tortillas\n" +
                                "200g low-fat natural yogurt\n" +
                                "50g extra-mature cheddar cheese (or veg alternative), finely grated\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat the oil in a large frying pan. Cook the onions and carrots for 5-8 mins until soft – add a splash of water if they start to stick. Sprinkle in the chilli powder and cook for 1 min more. Pour in the tomatoes and pulses and bring to the boil. Turn down the heat and simmer for 5-10 mins, stirring occasionally, until thickened. Remove from the heat and season well.\n" +
                                "\n" +
                                "2. Heat grill to high. Spread a spoonful of the bean chilli over a large ovenproof dish. Lay each tortilla onto a board, fill with a few tbsp of chilli mixture, fold over the ends and roll up to seal. Place them into the ovenproof dish. Spoon the remaining chilli on top.\n" +
                                "\n" +
                                "3. Mix the yogurt and grated cheese together with some seasoning, and spoon over the enchiladas. Grill for a few mins until the top is golden and bubbling. Serve with a green salad.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Chicken, Chili, and Cheese Quesadillas"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "qXoIp2CJV-E");
                        intent.putExtra("recipe", "Chicken, Chili, and Cheese Quesadillas\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "Quesadillas:\n" +
                                "6 ounces Cheddar, Monterey Jack or Colby cheese, thinly sliced\n" +
                                "1 tablespoon chopped pickled jalapenos\n" +
                                "1 cup shredded cooked chicken (about 3 ounces)\n" +
                                "12 corn tortillas, preferably white\n" +
                                "4 tablespoons (1/2 stick) unsalted butter\n" +
                                "\n" +
                                "Topping and Salsa:\n" +
                                "1 pound vine-ripened tomatoes (about 2 tomatoes)\n" +
                                "1/4 small red onion\n" +
                                "2 to 3 tablespoons chopped cilantro\n" +
                                "Hot sauce such as chipotle or Mexican green chili sauce to taste (1/2 teaspoon)\n" +
                                "Kosher salt\n" +
                                "1 Hass avocado, halved, seeded, and sliced \n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Lay 6 tortillas on the work surface, and divide the cheese, jalapenos, and chicken among the tortillas. (Its best to leave about an inch border on the edge of the tortilla uncovered to allow for the spread of the melting cheese.) Top with remaining tortillas and press gently to seal. Melt 1 tablespoon butter in a small skillet. Carefully place a quesadilla in the skillet and fry, turning once, until golden and little bubbles appear on both sides, 4 to 5 minutes in all. Repeat with the remaining quesadillas, wiping out the pan between batches if the butter burns. \n" +
                                "\n" +
                                "2. While the quesadillas cook make the salsa: Halve the tomatoes and grate them on the largest holes of a box grater into a bowl, discarding the skins. Grate the onion into the tomato and stir in the cilantro, hot sauce and salt, to taste. \n" +
                                "\n" +
                                "3. Cut quesadillas into 4 wedges with a pizza wheel or knife and serve with the salsa and avocado.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Crispy Chicken Mini-Tacos"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "E4aUpBqkVdo");
                        intent.putExtra("recipe", "Crispy Chicken Mini-Tacos\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 cup finely chopped tomato\n" +
                                "1/2 cup finely chopped white onion\n" +
                                "1 jalapeno, stemmed and deveined\n" +
                                "2 1 tablespoons chopped fresh cilantro leaves\n" +
                                "Salt and freshly ground black pepper\n" +
                                "1 bone-in chicken breast, with skin\n" +
                                "2 teaspoons olive oil, plus 2 tablespoons\n" +
                                "Vegetable oil, for frying\n" +
                                "6 corn tortillas\n" +
                                "1/4 cup Mexican crema or sour cream\n" +
                                "3 tablespoons shredded iceberg lettuce\n" +
                                "3 tablespoons queso fresco or mild feta cheese\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Salsa: Combine the tomato, onion, jalapeno, and cilantro in a bowl. Mix well and season with salt and pepper, to taste. Set aside.\n" +
                                "\n" +
                                "2. Preheat the oven to 350 degrees F. Brush the chicken breast with olive oil and sprinkle generously with salt and pepper, to taste. Put the chicken on a small sheet pan and roast until fully cooked through, about 25 minutes. Remove the chicken from the oven and allow it to cool before shredding.\n" +
                                "\n" +
                                "3. In a medium shallow skillet heat enough vegetable oil to come half way up the sides of the pan. Shred the chicken into small pieces and put about 2 tablespoons down the center of each corn tortilla. Roll up each tortilla like a cigar and secure them with a toothpick. Fry the tacos until golden brown on all sides, turning once, about 4 minutes total. Remove the toothpicks and cut each taco in half.\n" +
                                "\n" +
                                "4. To serve: Top with shredded lettuce and freshly made salsa. Drizzle with Mexican crema and sprinkle with crumbled queso fresco.\n" +
                                "\n" +
                                "Cook’s Note\n" +
                                "Before rolling flautas heat up tortillas directly over a gas flame (or dry skillet) to make them nice and pliable.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Chicken Chilaquiles"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "kCbUPOYqqp4");
                        intent.putExtra("recipe", "Chicken Chilaquiles\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1/4 pound chorizo\n" +
                                "2 skinless, boneless chicken breast halves, cut into 1-inch cubes\n" +
                                "1/2 (10 ounce) bag tortilla chips\n" +
                                "1 cup frozen corn kernels\n" +
                                "1 (19 ounce) can green enchilada sauce\n" +
                                "1/2 cup sour cream\n" +
                                "2 cups shredded Monterey Jack cheese\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat an oven to 400 degrees F (200 degrees C).\n" +
                                "\n" +
                                "2. Cook the chorizo in a skillet over medium heat, stirring to break it into tiny pieces. Place the raw chicken into the skillet with the chorizo; cook and stir the meats together until the chicken is no longer pink in the center, about 10 minutes.\n" +
                                "\n" +
                                "3. Spread half of the tortilla chips over the bottom of a casserole dish; top the chips with the cooked chorizo and chicken mixture. Sprinkle the corn evenly over the meats and layer the remaining chips over the top. Whisk together the green enchilada sauce and sour cream in a mixing bowl; pour over the top of the casserole. Top the casserole with the shredded Monterey Jack cheese.\n" +
                                "\n" +
                                "4. Bake the chilaquiles in the preheated oven until the casserole is bubbly and the chips begin to brown, 15 to 20 minutes.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Mexican Chicken Stew with Quinoa & Beans"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "cvd-aCljZ0g");
                        intent.putExtra("recipe", "Mexican Chicken Stew with Quinoa & Beans\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 tbsp olive oil\n" +
                                "1 onion, sliced\n" +
                                "2 red peppers, deseeded and chopped into largish chunks\n" +
                                "3 tbsp chipotle paste\n" +
                                "2 x 400g cans chopped tomatoes\n" +
                                "4 skinless chicken breasts\n" +
                                "140g quinoa\n" +
                                "2 chicken stock cubes\n" +
                                "1 x 400g can pinto beans, drained\n" +
                                "small bunch coriander, most chopped, a few leaves left whole\n" +
                                "juice 1 lime\n" +
                                "1 tbsp sugar\n" +
                                "natural yogurt, to serve\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat the oil in a deep frying pan and fry the onions and peppers for a few mins until softened. Stir in the chipotle paste for a minute, followed by the tomatoes. Add up to a tomato can-full of water to cover the chicken and bring to a gentle simmer. Add the chicken breasts and gently simmer, turning the chicken occasionally, for 20 mins until the chicken is cooked through.\n" +
                                "\n" +
                                "2. Bring a large saucepan of water to the boil with the stock cubes. Add the quinoa and cook for 15 mins until tender, adding the beans for the final min. Drain well and stir in the coriander and lime juice, then check for seasoning before covering to keep warm.\n" +
                                "\n" +
                                "3. Lift the chicken out onto a board and shred each breast using two forks. Stir back into the tomato sauce with the sugar and season. Serve with the quinoa, scattering the stew with some coriander leaves just before dishing up and eating with a dollop of yogurt on the side.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Spicy Black Beans and Yellow Rice"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "b49Ofi6nPuQ");
                        intent.putExtra("recipe", "Spicy Black Beans and Yellow Rice\n" +
                                "\n" +
                                "INGREDIENTS\n" +
                                "Spicy Black Beans:\n" +
                                "2 cups (about 1 pound) dried black beans, picked over, soaked overnight\n" +
                                "3 tablespoons extra-virgin olive oil\n" +
                                "1/2 medium onion, diced\n" +
                                "1 jalapeno pepper, chopped\n" +
                                "2 cloves garlic, chopped\n" +
                                "1 bay leaf\n" +
                                "Kosher salt\n" +
                                "Freshly ground black pepper\n" +
                                "\n" +
                                "Yellow Rice:\n" +
                                "2 cups long-grain rice\n" +
                                "4 cups water\n" +
                                "2 cloves garlic, smashed\n" +
                                "1 tablespoon turmeric\n" +
                                "1 teaspoon kosher salt\n" +
                                "1 bay leaf\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. For the beans:\n" +
                                "In a large pot, soak beans overnight covered in water by 2 inches. Drain and set aside.\n" +
                                "In the same pot, heat the olive oil. Add the onion, jalapeno pepper, garlic, and bay leaf and cook until the vegetables begin to soften, about 5 minutes. Add the beans and cover with water by about 1-inch. Bring to a boil, reduce the heat, cover, and simmer for 1 to 1 1/2 hours, or until the beans are tender. Remove the bay leaf and discard. Taste the beans and season with salt and pepper.\n" +
                                "\n" +
                                "2. For the rice:\n" +
                                "Put all the ingredients into a heavy-bottomed pot, stir well, and bring to a boil over medium-high heat. Reduce the heat to a simmer, cover, and cook over low heat until the rice has absorbed the water, about 15 to 20 minutes. Remove from the heat and let sit, covered, for 5 minutes. Discard the garlic and bay leaf, fluff with a fork, and serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Spicy Seafood Stew with Tomatoes & Lime"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "H56YYdalS7c");
                        intent.putExtra("recipe", "Spicy Seafood Stew with Tomatoes & Lime\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 dried ancho or guajillo chillies\n" +
                                "1 tbsp olive oil\n" +
                                "1 large onion, chopped\n" +
                                "4 garlic cloves, chopped\n" +
                                "1 tsp chipotle paste or 1 tsp smoked hot paprika (pimentón)\n" +
                                "1 tsp ground cumin\n" +
                                "700ml chicken stock\n" +
                                "250g chopped tomato, from a can\n" +
                                "200g large peeled raw prawn\n" +
                                "300g halibut or other firm white fish fillets, cut into 2½ cm pieces\n" +
                                "300g clam\n" +
                                "500g small new potato, halved and boiled\n" +
                                "juice 2 limes\n" +
                                "\n" +
                                "To serve\n" +
                                "lime wedges\n" +
                                "1 avocado, chopped\n" +
                                "handful coriander leaves\n" +
                                "1 small red onion, finely diced\n" +
                                "corn tortillas, sliced and baked\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Toast the chillies in a hot dry frying pan for a few moments (they will puff up a bit), then remove. Deseed and stem chillies, and soak in boiling water for 15 mins.\n" +
                                "\n" +
                                "2. Heat the olive oil in a large saucepan over a medium heat. Add the onion and garlic, season and cook for about 5 mins or until softened. Add the chipotle paste, reconstituted chillies, cumin, stock and tomatoes. Sauté for 5 mins, then purée until very fine in a blender. Pour back into the pan and bring to the boil. Reduce the heat and simmer for 10 mins. When close to eating, add the prawns, fish fillets, clams and potatoes. Place a lid on top and cook for 5 mins over a medium-high heat. Add the lime juice and serve with lime wedges, avocado, coriander, red onion and tortilla chips for sprinkling over.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Vietnamese Pork Chops with Ginger Rice"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "qKWICt1SpCU");
                        intent.putExtra("recipe", "Vietnamese Pork Chops with Ginger Rice\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 tablespoons packed brown sugar\n" +
                                "2 tablespoons low-sodium soy sauce \n" +
                                "1 tablespoon fish sauce \n" +
                                "2 tablespoons finely chopped fresh lemongrass (or 1 tablespoon grated lemon zest)\n" +
                                "2 cloves garlic, grated\n" +
                                "1 shallot, finely chopped\n" +
                                "4 thin bone-in pork chops (about 4 ounces each)\n" +
                                "1 cup jasmine rice\n" +
                                "1 2-inch piece ginger, peeled and grated (about 2 tablespoons) \n" +
                                "1/2 cup roughly chopped fresh mint\n" +
                                "2 Persian cucumbers, diced\n" +
                                "Kosher salt and freshly ground pepper\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Combine 1/4 cup water with the brown sugar, soy sauce, fish sauce, lemongrass, garlic and shallot in a shallow dish. Add the pork chops and turn to coat. Let marinate 15 minutes.\n" +
                                "\n" +
                                "2. Meanwhile, cook the rice as the label directs, adding the grated ginger to the water.\n" +
                                "\n" +
                                "3. Preheat the broiler. Remove the pork chops from the marinade; transfer to a broiler pan (reserve the marinade). Broil until the pork is charred and cooked through, 6 minutes. Transfer the marinade to a skillet; add 1/4 cup water and bring to a boil over high heat. Cook, stirring occasionally, until thickened, about 3 minutes.\n" +
                                "\n" +
                                "4. Fluff the rice with a fork and stir in the mint and cucumber; season with salt and pepper. Serve the pork with the rice and pan sauce.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Grilled Vietnamese Chicken Sandwiches"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "dZg_wHmhozE");
                        intent.putExtra("recipe", "Grilled Vietnamese Chicken Sandwiches\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 cup rice vinegar\n" +
                                "1/2 cup sugar\n" +
                                "Kosher salt\n" +
                                "1 2-inch piece peeled fresh ginger, sliced\n" +
                                "2 carrots, cut into matchsticks (about 1 cup)\n" +
                                "1/2 small daikon radish, cut into matchsticks (about 1 cup)\n" +
                                "4 stalks lemongrass, finely chopped\n" +
                                "1 shallot, thinly sliced\n" +
                                "3 tablespoons soy sauce\n" +
                                "3 tablespoons fish sauce\n" +
                                "4 large skinless, boneless chicken thighs (1 1/4 to 1 1/2 pounds)\n" +
                                "Vegetable oil, for the grill\n" +
                                "1 cup fresh cilantro\n" +
                                "1 loaf soft French bread, split and cut into four 6-inch pieces\n" +
                                "1/4 cup mayonnaise, preferably Japanese (such as Kewpie)\n" +
                                "2 Persian or other small cucumbers, thinly sliced\n" +
                                "1 jalapeno pepper, thinly sliced\n" +
                                "Sriracha, for serving\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Combine the vinegar, sugar, 1/2 cup water, 1 teaspoon salt and the ginger in a small saucepan and bring to a boil. Cook, stirring, until the sugar dissolves, about 2 minutes. Let cool.\n" +
                                "\n" +
                                "2. Transfer half of the vinegar mixture to a large bowl and add the carrots and daikon; cover and refrigerate until ready to serve.\n" +
                                "\n" +
                                "3. Transfer the remaining vinegar mixture to a shallow baking dish; stir in the lemongrass, shallot, soy sauce and fish sauce. Add the chicken thighs and toss to coat. Cover and refrigerate 2 hours, flipping the chicken halfway through.\n" +
                                "\n" +
                                "4. Preheat a grill to medium high and brush the grates with vegetable oil. Remove the chicken from the marinade, scraping off the lemongrass and shallot; season with salt. Grill the chicken until well marked and cooked through, about 5 minutes per side. Remove to a cutting board.\n" +
                                "\n" +
                                "5. Drain the carrots and daikon; stir in the cilantro. Cut the chicken thighs in half. Toast the bread on the grill and spread the mayonnaise on both sides; sandwich with the sliced cucumber, chicken, carrot mixture and jalapeno. Serve with Sriracha.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Spanakopita (Greek Spinach Pie)"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "eUTVesSFows");
                        intent.putExtra("recipe", "Spanakopita (Greek Spinach Pie)\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "3 tablespoons olive oil\n" +
                                "1 large onion, chopped\n" +
                                "1 bunch green onions, chopped\n" +
                                "2 cloves garlic, minced\n" +
                                "2 pounds spinach, rinsed and chopped\n" +
                                "1/2 cup chopped fresh parsley\n" +
                                "2 eggs, lightly beaten\n" +
                                "1/2 cup ricotta cheese\n" +
                                "1 cup crumbled feta cheese\n" +
                                "8 sheets phyllo dough\n" +
                                "1/4 cup olive oil\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat oven to 350 degrees F (175 degrees C). Lightly oil a 9x9 inch square baking pan. \n" +
                                "\n" +
                                "2. Heat 3 tablespoons olive oil in a large skillet over medium heat. Saute onion, green onions and garlic, until soft and lightly browned. Stir in spinach and parsley, and continue to saute until spinach is limp, about 2 minutes. Remove from heat and set aside to cool. \n" +
                                "\n" +
                                "3. In a medium bowl, mix together eggs, ricotta, and feta. Stir in spinach mixture. Lay 1 sheet of phyllo dough in prepared baking pan, and brush lightly with olive oil. Lay another sheet of phyllo dough on top, brush with olive oil, and repeat process with two more sheets of phyllo. The sheets will overlap the pan. Spread spinach and cheese mixture into pan and fold overhanging dough over filling. Brush with oil, then layer remaining 4 sheets of phyllo dough, brushing each with oil. Tuck overhanging dough into pan to seal filling. \n" +
                                "\n" +
                                "4. Bake in preheated oven for 30 to 40 minutes, until golden brown. Cut into squares and serve while hot. ");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Garides Saganaki (Shrimp with Tomatoes and Feta)"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "uO0ejc85zSE");
                        intent.putExtra("recipe", "GARIDES SAGANAKI (SHRIMP WITH TOMATOES AND FETA)\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 tbsp. extra-virgin olive oil\n" +
                                "1/2 small yellow onion, finely chopped\n" +
                                "1/2 medium hot green chile, stemmed and finely chopped\n" +
                                "1 1/4 cups canned whole, peeled tomatoes in juice, crushed by hand\n" +
                                "Kosher salt and freshly ground black pepper, to taste\n" +
                                "6 large head-on shrimp (about 12 oz.), bodies peeled (heads and tail shells left intact), deveined\n" +
                                "4 oz. Greek feta, coarsely crumbled\n" +
                                "2 tbsp. ouzo\n" +
                                "1 tbsp. finely chopped parsley\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat broiler to high. Heat oil in an 8\" round metal gratin dish or a heavy ovenproof skillet over medium heat. Add onion and chile, and cook, stirring often, until soft, about 5 minutes. Stir in tomatoes, and season to taste with salt and pepper; cook until slightly thickened, about 4 minutes.\n" +
                                "\n" +
                                "2. Arrange shrimp in dish, spoon some sauce on top, and continue to simmer until shrimp are pink and just cooked through, about 2 minutes per side. Scatter feta around shrimp, then transfer dish to broiler, and broil until feta begins to melt, about 2 minutes. Remove dish from broiler. Warm ouzo in a tiny pot over low heat, then ignite it with a kitchen match and pour over shrimp and feta. When flames die out, garnish dish with parsley, and serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Italian Chicken Cacciatore"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "pHZcqwJfCQI");
                        intent.putExtra("recipe", "Italian Chicken Cacciatore\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1/4 cup olive oil, divided\n" +
                                "1 onion, diced\n" +
                                "1/4 cup all-purpose flour\n" +
                                "1/2 teaspoon salt\n" +
                                "1/4 teaspoon freshly ground black pepper\n" +
                                "8 chicken thighs\n" +
                                "1/2 cup dry white wine\n" +
                                "2 (14.5 ounce) cans diced tomatoes\n" +
                                "2 teaspoons tomato paste\n" +
                                "1/4 teaspoon white sugar, or more to taste\n" +
                                "salt and ground black pepper to taste\n" +
                                "1/2 cup chicken broth, or more as needed\n" +
                                "1/2 cup black olives, pitted\n" +
                                "1 tablespoon chopped fresh parsley\n" +
                                "1 tablespoon torn basil leaves\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat 2 tablespoons olive oil in a skillet over medium heat and cook onion, stirring often, until soft and translucent, about 5 minutes. Transfer to a pot.\n" +
                                "\n" +
                                "2. Combine flour, 1/2 teaspoon salt, and 1/4 teaspoon pepper in a large bowl. Toss chicken thighs in the flour mixture until evenly coated.\n" +
                                "\n" +
                                "3. Heat remaining 2 tablespoons olive oil in the skillet over medium heat, add chicken thighs, and brown on one side, without turning, for 5 minutes. Turn and cook until browned on the other side, about 5 minutes more. Transfer browned chicken thighs to the pot.\n" +
                                "\n" +
                                "4. Pour white wine into the skillet; bring to a boil. Stir to loosen all the browned bits of chicken and flavors in the skillet pour into the pot. Add diced tomatoes, tomato paste, and sugar; season with salt and pepper. Add as much chicken stock as needed to cover the chicken. Cover pot and simmer over medium heat, stirring occasionally, until chicken is no longer pink in the center, about 45 minutes.\n" +
                                "\n" +
                                "5. Stir in olives, parsley, and basil. Stir to heat through.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Thai Peanut Chicken and Noodles"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "8uZzIU5--gY");
                        intent.putExtra("recipe", "Thai Peanut Chicken and Noodles\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1/2 cup water\n" +
                                "1/4 cup soy sauce\n" +
                                "2 tablespoons rice vinegar\n" +
                                "2 tablespoons creamy peanut butter\n" +
                                "3 garlic cloves, minced\n" +
                                "1 to 2 teaspoons Sriracha chili sauce\n" +
                                "1 teaspoon sesame oil\n" +
                                "1 teaspoon molasses\n" +
                                "1 package (6.75 ounces) thin rice noodles\n" +
                                "2 tablespoons peanut oil, divided\n" +
                                "1 pound chicken tenderloins, cut into 3/4-inch pieces\n" +
                                "1 medium onion, chopped\n" +
                                "Halved cucumber slices and chopped peanuts, optional\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. For sauce, whisk together first eight ingredients. Bring a large saucepan of water to a boil; remove from heat. Add noodles; let stand until noodles are tender but firm, 3-4 minutes. Drain; rinse with cold water and drain well.\n" +
                                "\n" +
                                "2. In a large skillet, heat 1 tablespoon peanut oil over medium-high heat; saute chicken until no longer pink, 5-7 minutes. Remove from pan.\n" +
                                "\n" +
                                "3. In same pan, saute onion in remaining oil over medium-high heat until tender, 2-3 minutes. Stir in sauce; cook and stir over medium heat until slightly thickened. Add noodles and chicken; heat through, tossing to combine. If desired, top with cucumber and chopped peanuts. Serve immediately.\n" +
                                "\n" +
                                "Test Kitchen tips\n" +
                                "1. This recipe can be made with angel hair pasta or thin spaghetti. Cook according to package directions for al dente, rinse with cold water, then drain. Add to the chicken mixture as directed.\n" +
                                "\n" +
                                "2. These noodles are lightly coated with sauce. For more peanut flavor or creamier sauce, increase the peanut butter by 1 to 2 tablespoons.\n" +
                                "\n" +
                                "3. If you don't have molasses, the same amount of honey or brown sugar can be used instead.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Gyoza"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "z60_v7NhFck");
                        intent.putExtra("recipe", "Gyoza\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 tablespoon sesame oil\n" +
                                "2 cups chopped cabbage\n" +
                                "1/4 cup chopped onion\n" +
                                "1 clove garlic, chopped\n" +
                                "1/4 cup chopped carrot\n" +
                                "1/2 pound ground pork\n" +
                                "1 egg\n" +
                                "1 tablespoon vegetable oil\n" +
                                "1 (10 ounce) package wonton wrappers\n" +
                                "1/4 cup water\n" +
                                "1/4 cup soy sauce\n" +
                                "2 tablespoons rice vinegar\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Heat sesame oil in a large skillet over medium high heat. Mix in cabbage, onion, garlic and carrot. Cook and stir until cabbage is limp. Mix in ground pork and egg. Cook until pork is evenly brown and egg is no longer runny.\n" +
                                "\n" +
                                "2. Preheat vegetable oil in a large skillet over medium high heat.\n" +
                                "\n" +
                                "3. Place approximately 1 tablespoon of the cabbage and pork mixture in the center of each wrapper. Fold wrappers in half over filling, and seal edges with moistened fingers.\n" +
                                "\n" +
                                "4. In the preheated vegetable oil, cook gyoza approximately 1 minute per side, until lightly browned. Place water into skillet and reduce heat. Cover and allow gyoza to steam until the water is gone.\n" +
                                "\n" +
                                "5. In a small bowl, mix soy sauce and rice vinegar. Use the mixture as a dipping sauce for the finished wrappers.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Pontevedra-Style Spanish Chicken"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "gQySowPoSlc");
                        intent.putExtra("recipe", "Pontevedra-Style Spanish Chicken\n" +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 (3 to 3 1/2 pound) whole chicken, cut into pieces\n" +
                                "2 cups olive oil\n" +
                                "1/2 cup butter, melted\n" +
                                "1 head roasted garlic, minced\n" +
                                "1/4 cup sweet Pimenton de la Vera (Spanish smoked paprika)\n" +
                                "Salt and freshly ground black pepper to taste\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat oven to 350 degrees F (175 degrees C).\n" +
                                "\n" +
                                "2. Place the chicken pieces in a roasting pan skin-side down. Pour the olive oil and melted butter over the chicken. Sprinkle the pieces with minced roasted garlic, paprika, salt, and pepper.\n" +
                                "\n" +
                                "3. Roast in the preheated oven for 35 minutes. Turn the chicken pieces skin-side up and roast until the chicken is done and the skin is crispy, about 25 minutes more. An instant-read thermometer inserted into the meat should read 165 degrees F (74 degrees C).\n" +
                                "\n" +
                                "4. Serve the chicken pieces with the sauce on the side for dipping.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Chicken Cordon Bleu I"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "uKCL85oXWD0");
                        intent.putExtra("recipe", "Chicken Cordon Bleu I\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "4 skinless, boneless chicken breast halves\n" +
                                "1/4 teaspoon salt\n" +
                                "1/8 teaspoon ground black pepper\n" +
                                "6 slices Swiss cheese\n" +
                                "4 slices cooked ham\n" +
                                "1/2 cup seasoned bread crumbs\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat oven to 350 degrees F (175 degrees C). Coat a 7x11 inch baking dish with nonstick cooking spray.\n" +
                                "\n" +
                                "2. Pound chicken breasts to 1/4 inch thickness.\n" +
                                "\n" +
                                "3. Sprinkle each piece of chicken on both sides with salt and pepper. Place 1 cheese slice and 1 ham slice on top of each breast. Roll up each breast, and secure with a toothpick. Place in baking dish, and sprinkle chicken evenly with bread crumbs.\n" +
                                "\n" +
                                "4. Bake for 30 to 35 minutes, or until chicken is no longer pink. Remove from oven, and place 1/2 cheese slice on top of each breast. Return to oven for 3 to 5 minutes, or until cheese has melted. Remove toothpicks, and serve immediately.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Mike's Portuguese Tuna Rice Casserole"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "Z2gbULH7tdI");
                        intent.putExtra("recipe", "Mike's Portuguese Tuna Rice Casserole\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "3 cups water\n" +
                                "1 1/2 cups uncooked white rice\n" +
                                "1 tablespoon butter\n" +
                                "1 tablespoon olive oil\n" +
                                "1 tablespoon olive oil\n" +
                                "1 small onion, chopped\n" +
                                "2 cloves garlic, minced\n" +
                                "2 (5 ounce) cans tuna, drained\n" +
                                "3/4 cup heavy cream\n" +
                                "3 tablespoons ketchup\n" +
                                "1 teaspoon hot pepper sauce\n" +
                                "Salt and pepper to taste\n" +
                                "1/2 cup sliced black olives\n" +
                                "1/2 cup shredded Cheddar cheese\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Bring the rice, water, butter, and 1 tablespoon olive oil to a boil in a saucepan over high heat. Reduce heat to medium-low, cover, and simmer until the rice is tender, and the liquid has been absorbed, 20 to 25 minutes.\n" +
                                "\n" +
                                "2. Preheat an oven to 350 degrees F (175 degrees C).\n" +
                                "\n" +
                                "3. Heat 1 tablespoon of olive oil in a skillet over medium heat. Stir in the onion and garlic; cook and stir until the onion has softened and turned translucent, about 5 minutes. Stir in the tuna, cream, ketchup, hot sauce, salt, and pepper. Simmer on low until the mixture thickens, about 10 minutes.\n" +
                                "\n" +
                                "4. Cover the bottom of an 8 inch square baking dish with half of the cooked rice. Spread the tuna mixture over the rice and cover with the remaining rice. Sprinkle the olives and cheese over the top of the rice. Bake until the cheese melts and the casserole is heated through, 15 to 20 minutes.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Authentic Korean Bulgogi"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "dRrkWLOfxp0");
                        intent.putExtra("recipe", "Authentic Korean Bulgogi\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 1/2 pounds beef top sirloin, thinly sliced\n" +
                                "2 tablespoons white cooking wine\n" +
                                "1 cup pear juice\n" +
                                "1 teaspoon ground black pepper\n" +
                                "1/4 cup soy sauce\n" +
                                "1 tablespoon white sugar\n" +
                                "2 tablespoons Asian (toasted) sesame oil\n" +
                                "1 tablespoon minced garlic\n" +
                                "2 tablespoons chopped green onion\n" +
                                "1 tablespoon sesame seeds\n" +
                                "1/2 pound fresh mushrooms, halved (optional)\n" +
                                "1/2 onion, chopped (optional)\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Place the beef in a bowl, and pour in the cooking wine, pear juice, and black pepper. Stir to combine, and allow to marinate for 30 minutes. Stir in the soy sauce, sugar, sesame oil, garlic, green onion, and sesame seeds, and marinate in refrigerator at least 2 hours or overnight.\n" +
                                "\n" +
                                "2. Preheat an outdoor grill for medium-high heat.\n" +
                                "\n" +
                                "3. Remove the beef from the marinade, and discard the marinade. Place a sheet of aluminum foil on the heated grill, and lay the beef slices separately on the foil. Place the mushrooms and onion on another part of the foil. Cook the beef slices until they are evenly brown, 3 to 5 minutes per side. Serve with cooked mushrooms and onion.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Hasselback Potatoes"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "eK99GLicMGc");
                        intent.putExtra("recipe", "Hasselback Potatoes\n" +
                                "\n" +
                                "INGREDIENTS\n" +
                                "4 (8 ounce) baking potatoes\n" +
                                "2 tablespoons butter, melted\n" +
                                "Salt and pepper to taste\n" +
                                "2 tablespoons finely grated fresh Romano cheese\n" +
                                "1 tablespoon seasoned dry bread crumbs\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat the oven to 425 degrees F (220 degrees C).\n" +
                                "\n" +
                                "2. Peel the potatoes, and place in bowl of cold water to prevent browning. Place potatoes into a large wooden or metal spoon. Using a sharp knife, make slices across the potato the short way about 1/8 to 1/4 inch apart, making sure to cut down to the lip of the spoon, not all the way through the potato. The slices should stay connected at the bottom, and the spoon helps keep the depth even. Return the potato to the bowl of water, and proceed with the remaining potatoes.\n" +
                                "\n" +
                                "3. When all of the potatoes are cut, place them cut side up in a shallow baking dish or small roasting pan. Drizzle with half of the butter, then season with salt and pepper.\n" +
                                "\n" +
                                "4. Bake for 35 to 40 minutes in the preheated oven. Remove from the oven, and drizzle with the remaining butter. Sprinkle Romano cheese and bread crumbs onto the tops of the potatoes, and season with a little more salt and pepper. Return to the oven, and bake for an additional 20 minutes, or until nicely browned.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Aussie Lime Pie"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "CYA_Fvmndb8");
                        intent.putExtra("recipe", "Aussie Lime Pie\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2/3 cup rolled oats\n" +
                                "2/3 cup flaked coconut\n" +
                                "2/3 cup all-purpose flour\n" +
                                "1/2 cup white sugar\n" +
                                "1/2 cup butter, melted\n" +
                                "2 tablespoons light corn syrup\n" +
                                "1 teaspoon baking soda\n" +
                                "1 (14 ounce) can sweetened condensed milk\n" +
                                "1/2 cup lime juice\n" +
                                "4 egg yolks, beaten\n" +
                                "2 teaspoons grated lemon zest\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Preheat oven to 350 degrees F (175 degrees C). Lightly grease a 9 inch glass pie pan.\n" +
                                "\n" +
                                "2. In a medium bowl, mix together oats, coconut, flour, and sugar. In a separate bowl, mix together melted butter or margarine, corn syrup, and baking soda until frothy. Add corn syrup mixture to oat mixture and stir until ingredients are thoroughly combined. Press mixture evenly into bottom and sides of pie pan.\n" +
                                "\n" +
                                "3. In a medium mixing bowl, combine condensed milk, lime juice, egg yolks, and lemon rind. Beat on medium speed 1 minute. Pour mixture into pie crust.\n" +
                                "\n" +
                                "4. Bake in preheated oven for 20 minutes, until firm in center. Do not allow to brown on top. Chill before serving.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Apple Crumb Pie"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "ZQM53dJJKBQ");
                        intent.putExtra("recipe", "Apple Crumb Pie\n".toUpperCase() +
                                "\n" +
                                "INGREDEINTS\n" +
                                "For the crust: \n" +
                                "1 1/4 cups all-purpose flour, plus more for the work surface \n" +
                                "3/4 teaspoon kosher salt \n" +
                                "1 1/2 teaspoons granulated sugar \n" +
                                "6 tablespoons unsalted butter, cold and cut into pieces \n" +
                                "3 tablespoons solid vegetable shortening, cold \n" +
                                "3 to 6 tablespoons ice water \n" +
                                "\n" +
                                "For the filling: \n" +
                                "1 pound Cortland, Empire, or McIntosh apples \n" +
                                "2 pounds Granny Smith apples \n" +
                                "1/4 cup fresh lemon juice \n" +
                                "1/4 cup granulated sugar \n" +
                                "2 1/2 teaspoons ground cinnamon \n" +
                                "1/2 cup (about 2 ounces) walnuts, finely chopped \n" +
                                "\n" +
                                "For the topping: \n" +
                                "1 cup all-purpose flour \n" +
                                "1/4 cup packed dark brown sugar \n" +
                                "1 teaspoon ground cinnamon pinch of kosher salt \n" +
                                "8 tablespoons (1 stick) unsalted butter, cold and cut into pieces\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Make the crust. Combine the flour, salt, and sugar in a food processor. Add the butter and shortening and pulse to form a coarse crumble. While the motor is running, add the ice water, 1 tablespoon at a time, until the dough just comes together. Turn out onto a lightly floured surface and knead just until smooth. Shape into a disk and wrap in plastic. Refrigerate for 45 minutes.\n" +
                                "\n" +
                                "2. On a lightly floured surface, roll the dough into a circle about 14 inches in diameter and place in a 9-inch pie plate. Using your fingers, fold over any overhang and crimp the edge. Refrigerate until ready to use.\n" +
                                "\n" +
                                "3. Make the filling. Heat oven to 375° F.\n" +
                                "\n" +
                                "4. Peel, core, and slice all the apples 1/4 inch thick. Gently toss them in a bowl with the lemon juice, sugar, and cinnamon. Spoon into the crust and sprinkle the walnuts over the top.\n" +
                                "\n" +
                                "5. Make the topping. Combine the flour, sugar, cinnamon, and salt in a food processor. Add the butter and pulse to form a medium crumble (with pieces about the size of peas). Sprinkle the topping over the apples and walnuts. Bake for 1 hour, or until the crust is golden brown and the apples are tender.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("German Spaetzle Dumplings"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "lovPuX00Nlc");
                        intent.putExtra("recipe", "German Spaetzle Dumplings\n" +
                                "\n" +
                                "INGREDIENTS\n" +
                                "1 cup all-purpose flour\n" +
                                "1/4 cup milk\n" +
                                "2 eggs\n" +
                                "1/2 teaspoon ground nutmeg\n" +
                                "1 pinch freshly ground white pepper\n" +
                                "1/2 teaspoon salt\n" +
                                "1 gallon hot water\n" +
                                "2 tablespoons butter\n" +
                                "2 tablespoons chopped fresh parsley\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Mix together flour, salt, white pepper, and nutmeg. Beat eggs well, and add alternately with the milk to the dry ingredients. Mix until smooth.\n" +
                                "\n" +
                                "2. Press dough through spaetzle maker, or a large holed sieve or metal grater.\n" +
                                "\n" +
                                "3. Drop a few at a time into simmering liquid. Cook 5 to 8 minutes. Drain well.\n" +
                                "\n" +
                                "4. Saute cooked spaetzle in butter or margarine. Sprinkle chopped fresh parsley on top, and serve.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Russian Pelmeni"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "YO7AdLsUSec");
                        intent.putExtra("recipe", "Russian Pelmeni\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "Dough:\n" +
                                "1 egg\n" +
                                "1 teaspoon vegetable oil\n" +
                                "1 teaspoon salt\n" +
                                "3/4 cup warm water\n" +
                                "3 cups all-purpose flour\n" +
                                "1 tablespoon all-purpose flour\n" +
                                "\n" +
                                "Filling:\n" +
                                "18 ounces ground beef\n" +
                                "1 small onion, chopped\n" +
                                "1 1/2 tablespoons ice-cold water\n" +
                                "1 tablespoon coarse salt\n" +
                                "Freshly ground pepper to taste\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Combine egg, vegetable oil, and salt in a measuring cup; add enough water to fill to 1 cup. Pour into a bowl, add 3 cups flour, and knead into a smooth, elastic dough. Cover with a kitchen towel and rest for 30 minutes.\n" +
                                "\n" +
                                "2. Dust a baking sheet lightly with 1 tablespoon flour.\n" +
                                "\n" +
                                "3. Combine ground beef, onion, water, salt, and pepper in a bowl and mix filling thoroughly by hand or using a fork.\n" +
                                "\n" +
                                "4. Roll out a portion of the dough very thinly on a lightly floured surface and cut out 2 1/2-inch rounds with a cookie cutter or a wine glass. Keep the rest of the dough covered with a towel to avoid drying out. Place 1/2 to 1 teaspoon of filling on one side of the dough circle. Fold dough over and seal the edges using fingers, forming a crescent. Join the ends and pinch them together. Place on the prepared baking sheet. Repeat with remaining dough and filling. Freeze pelmeni for 30 minutes to prevent them from sticking together.\n" +
                                "\n" +
                                "5. Bring a large pot of lightly salted water to a simmer and drop small batches of frozen pelmeni into simmering water. Cook and stir until the meat is cooked and pelmeni float to the top, about 5 minutes. Continue cooking for an additional 5 minutes. Transfer to serving plates using a slotted spoon.");
                        mContext.startActivity(intent);
                    }
                    if (modellist.get(position).getDname().equals("Egyptian Meatballs"))
                    {
                        Intent intent=new Intent(mContext,Recipes.class);
                        intent.putExtra("video", "7JFujsSfPUw");
                        intent.putExtra("recipe", "Egyptian Meatballs\n".toUpperCase() +
                                "\n" +
                                "INGREDIENTS\n" +
                                "2 pounds leeks, trimmed and outer leaves removed\n" +
                                "1 pound ground beef\n" +
                                "1 cup white bread crumbs\n" +
                                "2 eggssalt and ground black pepper to taste\n" +
                                "1 tablespoon olive oil\n" +
                                "3/4 cup water, or as needed\n" +
                                "1 tablespoon lemon juice\n" +
                                "1 tablespoon butter\n" +
                                "\n" +
                                "INSTRUCTIONS\n" +
                                "1. Bring a pot of lightly salted water to a boil. Add leeks; cook until tender, about 5 minutes. Drain; transfer to a plate to cool. Chop leeks finely with a sharp knife, or in a food processor.\n" +
                                "\n" +
                                "2. Combine leeks, ground beef, bread crumbs, and eggs in a large bowl; season with salt and pepper. Mix until combined; shape with hands into walnut-sized meatballs.\n" +
                                "\n" +
                                "3. Heat olive oil in a large skillet over medium heat. Cook meatballs, turning as needed, until evenly browned, 5 to 10 minutes. Add water, lemon juice, and butter; bring to a boil. Simmer, covered, until meatballs are no longer pink in the center, 15 to 20 minutes.");
                        mContext.startActivity(intent);
                    }
                }
            });

            return view;
        }

        public void filter(String charText)
        {
            charText=charText.toLowerCase(Locale.getDefault());
            modellist.clear();
            if (charText.length()==0)
            {
                modellist.addAll(arrayList);
            }
            else
            {
                for (Dishes dishes : arrayList)
                {
                    if (dishes.getDname().toLowerCase(Locale.getDefault())
                            .contains(charText))
                    {
                        modellist.add(dishes);
                    }
                }
            }
            notifyDataSetChanged();
        }
    }



