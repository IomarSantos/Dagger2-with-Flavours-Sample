package com.sekthdroid.dagger2flavourssample.data;

import com.sekthdroid.dagger2flavourssample.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SekthDroid on 04/09/15.
 * Project: Dagger2FlavoursSample
 * Package: com.sekthdroid.dagger2flavoursample.data
 */
public class StubItemRepository implements ItemsRepository{
    @Override
    public List<Item> getItems() {
        List<Item> items = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            items.add(new Item(i, "Stub item " + i));
        }
        return items;
    }
}
