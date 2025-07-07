package shop;

import java.util.List;

public class ItemService implements SmService<ItemDto, Integer>{
    @Override
    public void register(ItemDto itemDto) {

    }

    @Override
    public void modify(ItemDto itemDto) {

    }

    @Override
    public void remove(Integer integer) {

    }

    @Override
    public List<ItemDto> get() {
        return List.of();
    }

    @Override
    public ItemDto get(Integer integer) {
        return null;
    }
}
