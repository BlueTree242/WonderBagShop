// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import de.jatitv.wonderbagshop.DefultValue.DefultValue_WB3;
import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class WonderBag_3 {

    public static void WB3Create(){

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3.yml load...");

        File WB3YML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_3.yml");
        YamlConfiguration yamlConfiguration_WB3 = YamlConfiguration.loadConfiguration(WB3YML);


        // Shop

        if(yamlConfiguration_WB3.contains("Shop.Name")){
            DefultValue_WB3.Name = replace(yamlConfiguration_WB3.getString("Shop.Name"));
        }else{
            yamlConfiguration_WB3.set("Shop.Name", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Shop Name §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Shop.price")){
            DefultValue_WB3.price = Integer.valueOf(yamlConfiguration_WB3.getString("Shop.price"));
        }else{
            yamlConfiguration_WB3.set("Shop.price", DefultValue_WB3.price);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Shop price §4was added to §9WonderBag_3.yml§4!");
        }

        // WonderBag

        if(yamlConfiguration_WB3.contains("WonderBag.ChestName")){
            DefultValue_WB3.ChestName = replace(yamlConfiguration_WB3.getString("WonderBag.ChestName"));
        }else{
            yamlConfiguration_WB3.set("WonderBag.ChestName", "&2Wonder&6Bag &93");
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6WonderBag ChestName §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("WonderBag.Item_amount_(1-9)")){
            DefultValue_WB3.Item_anz = Integer.valueOf(yamlConfiguration_WB3.getString("WonderBag.Item_amount_(1-9)"));
        }else{
            yamlConfiguration_WB3.set("WonderBag.Item_amount_(1-9)", DefultValue_WB3.Item_anz);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6WonderBag Item_amount_(1-9) §4was added to §9WonderBag_3.yml§4!");
        }

        // Items

        if(yamlConfiguration_WB3.contains("Item1.Item")){
            DefultValue_WB3.Item1_Item = (yamlConfiguration_WB3.getString("Item1.Item"));
        }else{
            yamlConfiguration_WB3.set("Item1.Item", DefultValue_WB3.Item1_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item1 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item1.StackSize_(1-64)")){
            DefultValue_WB3.Item1_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item1.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item1.StackSize_(1-64)", DefultValue_WB3.Item1_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item1 StackSize_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item2.Item")){
            DefultValue_WB3.Item2_Item = (yamlConfiguration_WB3.getString("Item2.Item"));
        }else{
            yamlConfiguration_WB3.set("Item2.Item", DefultValue_WB3.Item2_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item2 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item2.StackSize_(1-64)")){
            DefultValue_WB3.Item2_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item2.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item2.StackSize_(1-64)", DefultValue_WB3.Item2_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item2 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item3.Item")){
            DefultValue_WB3.Item3_Item = (yamlConfiguration_WB3.getString("Item3.Item"));
        }else{
            yamlConfiguration_WB3.set("Item3.Item", DefultValue_WB3.Item3_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item3 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item3.StackSize_(1-64)")){
            DefultValue_WB3.Item3_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item3.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item3.StackSize_(1-64)", DefultValue_WB3.Item3_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item3 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item4.Item")){
            DefultValue_WB3.Item4_Item = (yamlConfiguration_WB3.getString("Item4.Item"));
        }else{
            yamlConfiguration_WB3.set("Item4.Item", DefultValue_WB3.Item4_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item4 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item4.StackSize_(1-64)")){
            DefultValue_WB3.Item4_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item4.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item4.StackSize_(1-64)", DefultValue_WB3.Item4_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item4 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item5.Item")){
            DefultValue_WB3.Item5_Item = (yamlConfiguration_WB3.getString("Item5.Item"));
        }else{
            yamlConfiguration_WB3.set("Item5.Item", DefultValue_WB3.Item5_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item5 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item5.StackSize_(1-64)")){
            DefultValue_WB3.Item5_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item5.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item5.StackSize_(1-64)", DefultValue_WB3.Item5_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item5 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item6.Item")){
            DefultValue_WB3.Item6_Item = (yamlConfiguration_WB3.getString("Item6.Item"));
        }else{
            yamlConfiguration_WB3.set("Item6.Item", DefultValue_WB3.Item6_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item6 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item6.StackSize_(1-64)")){
            DefultValue_WB3.Item6_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item6.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item6.StackSize_(1-64)", DefultValue_WB3.Item6_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item6 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item7.Item")){
            DefultValue_WB3.Item7_Item = (yamlConfiguration_WB3.getString("Item7.Item"));
        }else{
            yamlConfiguration_WB3.set("Item7.Item", DefultValue_WB3.Item7_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item7 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item7.StackSize_(1-64)")){
            DefultValue_WB3.Item7_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item7.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item7.StackSize_(1-64)", DefultValue_WB3.Item7_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item7 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item8.Item")){
            DefultValue_WB3.Item8_Item = (yamlConfiguration_WB3.getString("Item8.Item"));
        }else{
            yamlConfiguration_WB3.set("Item8.Item", DefultValue_WB3.Item8_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item8 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item8.StackSize_(1-64)")){
            DefultValue_WB3.Item8_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item8.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item8.StackSize_(1-64)", DefultValue_WB3.Item8_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item8 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item9.Item")){
            DefultValue_WB3.Item9_Item = (yamlConfiguration_WB3.getString("Item9.Item"));
        }else{
            yamlConfiguration_WB3.set("Item9.Item", DefultValue_WB3.Item9_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item9 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item9.StackSize_(1-64)")){
            DefultValue_WB3.Item9_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item9.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item9.StackSize_(1-64)", DefultValue_WB3.Item9_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item9 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item10.Item")){
            DefultValue_WB3.Item10_Item = (yamlConfiguration_WB3.getString("Item10.Item"));
        }else{
            yamlConfiguration_WB3.set("Item10.Item", DefultValue_WB3.Item10_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item10 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item10.StackSize_(1-64)")){
            DefultValue_WB3.Item10_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item10.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item10.StackSize_(1-64)", DefultValue_WB3.Item10_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item10 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item11.Item")){
            DefultValue_WB3.Item11_Item = (yamlConfiguration_WB3.getString("Item11.Item"));
        }else{
            yamlConfiguration_WB3.set("Item11.Item", DefultValue_WB3.Item11_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item11 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item11.StackSize_(1-64)")){
            DefultValue_WB3.Item11_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item11.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item11.StackSize_(1-64)", DefultValue_WB3.Item11_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item11 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item12.Item")){
            DefultValue_WB3.Item12_Item = (yamlConfiguration_WB3.getString("Item12.Item"));
        }else{
            yamlConfiguration_WB3.set("Item12.Item", DefultValue_WB3.Item12_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item12 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item12.StackSize_(1-64)")){
            DefultValue_WB3.Item12_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item12.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item12.StackSize_(1-64)", DefultValue_WB3.Item12_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item12 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item13.Item")){
            DefultValue_WB3.Item13_Item = (yamlConfiguration_WB3.getString("Item13.Item"));
        }else{
            yamlConfiguration_WB3.set("Item13.Item", DefultValue_WB3.Item13_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item13 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item13.StackSize_(1-64)")){
            DefultValue_WB3.Item13_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item13.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item13.StackSize_(1-64)", DefultValue_WB3.Item13_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item13 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item14.Item")){
            DefultValue_WB3.Item14_Item = (yamlConfiguration_WB3.getString("Item14.Item"));
        }else{
            yamlConfiguration_WB3.set("Item14.Item", DefultValue_WB3.Item14_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item14 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item14.StackSize_(1-64)")){
            DefultValue_WB3.Item14_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item14.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item14.StackSize_(1-64)", DefultValue_WB3.Item14_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item14 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item15.Item")){
            DefultValue_WB3.Item15_Item = (yamlConfiguration_WB3.getString("Item15.Item"));
        }else{
            yamlConfiguration_WB3.set("Item15.Item", DefultValue_WB3.Item15_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item15 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item15.StackSize_(1-64)")){
            DefultValue_WB3.Item15_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item15.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item15.StackSize_(1-64)", DefultValue_WB3.Item15_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item15 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item16.Item")){
            DefultValue_WB3.Item16_Item = (yamlConfiguration_WB3.getString("Item16.Item"));
        }else{
            yamlConfiguration_WB3.set("Item16.Item", DefultValue_WB3.Item16_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item16 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item16.StackSize_(1-64)")){
            DefultValue_WB3.Item16_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item16.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item16.StackSize_(1-64)", DefultValue_WB3.Item16_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item16 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item17.Item")){
            DefultValue_WB3.Item17_Item = (yamlConfiguration_WB3.getString("Item17.Item"));
        }else{
            yamlConfiguration_WB3.set("Item17.Item", DefultValue_WB3.Item17_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item17 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item17.StackSize_(1-64)")){
            DefultValue_WB3.Item17_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item17.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item17.StackSize_(1-64)", DefultValue_WB3.Item17_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item17 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item18.Item")){
            DefultValue_WB3.Item18_Item = (yamlConfiguration_WB3.getString("Item18.Item"));
        }else{
            yamlConfiguration_WB3.set("Item18.Item", DefultValue_WB3.Item18_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item18 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item18.StackSize_(1-64)")){
            DefultValue_WB3.Item18_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item18.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item18.StackSize_(1-64)", DefultValue_WB3.Item18_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item18 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item19.Item")){
            DefultValue_WB3.Item19_Item = (yamlConfiguration_WB3.getString("Item19.Item"));
        }else{
            yamlConfiguration_WB3.set("Item19.Item", DefultValue_WB3.Item19_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item19 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item19.StackSize_(1-64)")){
            DefultValue_WB3.Item19_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item19.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item19.StackSize_(1-64)", DefultValue_WB3.Item19_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item19 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item20.Item")){
            DefultValue_WB3.Item20_Item = (yamlConfiguration_WB3.getString("Item20.Item"));
        }else{
            yamlConfiguration_WB3.set("Item20.Item", DefultValue_WB3.Item20_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item20 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item20.StackSize_(1-64)")){
            DefultValue_WB3.Item20_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item20.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item20.StackSize_(1-64)", DefultValue_WB3.Item20_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item20 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item21.Item")){
            DefultValue_WB3.Item21_Item = (yamlConfiguration_WB3.getString("Item21.Item"));
        }else{
            yamlConfiguration_WB3.set("Item21.Item", DefultValue_WB3.Item21_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item21 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item21.StackSize_(1-64)")){
            DefultValue_WB3.Item21_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item21.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item21.StackSize_(1-64)", DefultValue_WB3.Item21_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item21 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item22.Item")){
            DefultValue_WB3.Item22_Item = (yamlConfiguration_WB3.getString("Item22.Item"));
        }else{
            yamlConfiguration_WB3.set("Item22.Item", DefultValue_WB3.Item22_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item22 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item22.StackSize_(1-64)")){
            DefultValue_WB3.Item22_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item22.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item22.StackSize_(1-64)", DefultValue_WB3.Item22_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item22 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item23.Item")){
            DefultValue_WB3.Item23_Item = (yamlConfiguration_WB3.getString("Item23.Item"));
        }else{
            yamlConfiguration_WB3.set("Item23.Item", DefultValue_WB3.Item23_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item23 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item23.StackSize_(1-64)")){
            DefultValue_WB3.Item23_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item23.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item23.StackSize_(1-64)", DefultValue_WB3.Item23_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item23 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item24.Item")){
            DefultValue_WB3.Item24_Item = (yamlConfiguration_WB3.getString("Item24.Item"));
        }else{
            yamlConfiguration_WB3.set("Item24.Item", DefultValue_WB3.Item24_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item24 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item24.StackSize_(1-64)")){
            DefultValue_WB3.Item24_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item24.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item24.StackSize_(1-64)", DefultValue_WB3.Item24_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item24 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item25.Item")){
            DefultValue_WB3.Item25_Item = (yamlConfiguration_WB3.getString("Item25.Item"));
        }else{
            yamlConfiguration_WB3.set("Item25.Item", DefultValue_WB3.Item25_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item25 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item25.StackSize_(1-64)")){
            DefultValue_WB3.Item25_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item25.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item25.StackSize_(1-64)", DefultValue_WB3.Item25_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item25 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item26.Item")){
            DefultValue_WB3.Item26_Item = (yamlConfiguration_WB3.getString("Item26.Item"));
        }else{
            yamlConfiguration_WB3.set("Item26.Item", DefultValue_WB3.Item26_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item26 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item26.StackSize_(1-64)")){
            DefultValue_WB3.Item26_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item26.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item26.StackSize_(1-64)", DefultValue_WB3.Item26_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item26 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item27.Item")){
            DefultValue_WB3.Item27_Item = (yamlConfiguration_WB3.getString("Item27.Item"));
        }else{
            yamlConfiguration_WB3.set("Item27.Item", DefultValue_WB3.Item27_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item27 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item27.StackSize_(1-64)")){
            DefultValue_WB3.Item27_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item27.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item27.StackSize_(1-64)", DefultValue_WB3.Item27_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item27 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item28.Item")){
            DefultValue_WB3.Item28_Item = (yamlConfiguration_WB3.getString("Item28.Item"));
        }else{
            yamlConfiguration_WB3.set("Item28.Item", DefultValue_WB3.Item28_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item28 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item28.StackSize_(1-64)")){
            DefultValue_WB3.Item28_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item28.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item28.StackSize_(1-64)", DefultValue_WB3.Item28_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item28 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item29.Item")){
            DefultValue_WB3.Item29_Item = (yamlConfiguration_WB3.getString("Item29.Item"));
        }else{
            yamlConfiguration_WB3.set("Item29.Item", DefultValue_WB3.Item29_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item29 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item29.StackSize_(1-64)")){
            DefultValue_WB3.Item29_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item29.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item29.StackSize_(1-64)", DefultValue_WB3.Item29_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item29 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        if(yamlConfiguration_WB3.contains("Item30.Item")){
            DefultValue_WB3.Item30_Item = (yamlConfiguration_WB3.getString("Item30.Item"));
        }else{
            yamlConfiguration_WB3.set("Item30.Item", DefultValue_WB3.Item30_Item);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item30 Item §4was added to §9WonderBag_3.yml§4!");
        }
        if(yamlConfiguration_WB3.contains("Item30.StackSize_(1-64)")){
            DefultValue_WB3.Item30_StackSize = Integer.valueOf(yamlConfiguration_WB3.getString("Item30.StackSize_(1-64)"));
        }else{
            yamlConfiguration_WB3.set("Item30.StackSize_(1-64)", DefultValue_WB3.Item30_StackSize);
            Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3 Setting §6Item30 Item_MaxStack_(1-64) §4was added to §9WonderBag_3.yml§4!");
        }

        try {
            yamlConfiguration_WB3.save(WB3YML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§2WonderBag_3.yml loaded successfully.");
    }

    public static void WB3Disable(){
        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4WonderBag_3.yml successfully deactivated.");
    }

    private static String replace(String Text) {
        File WB3YML = new File(Main.thisp().getDataFolder().getPath(), "WonderBag_3.yml");
        YamlConfiguration yamlConfiguration_wb3 = YamlConfiguration.loadConfiguration(WB3YML);
        return Text.replace("[prefix]", DefultValue.Prefix).replace("&", "§").replace("[currency]", DefultValue.Currency)
                .replace("[ue]", "ü").replace("[UE]", "Ü").replace("[oe]", "Ö").replace("[OE]", "Ö")
                .replace("[ae]", "ä").replace("[AE]", "Ä").replace("[WB1Name]", DefultValue_WB3.Name)
                .replace("[WB3Price]", String.valueOf(yamlConfiguration_wb3.get("Shop.price")));
    }



}