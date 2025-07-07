package shop;

import java.util.List;

public class ItemMySQLRepository implements SmRepository<ItemDto, Integer>{
    @Override
    public void insert(ItemDto itemDto) {

    }

    @Override
    public void update(ItemDto itemDto) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<ItemDto> selectAll() {
        return List.of();
    }

    @Override
    public ItemDto select(Integer integer) {
        return null;
    }
}
