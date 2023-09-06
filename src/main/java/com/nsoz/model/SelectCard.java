/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nsoz.model;

import com.nsoz.constants.ItemName;
import com.nsoz.constants.TaskName;
import com.nsoz.convert.Converter;
import com.nsoz.item.Item;
import com.nsoz.item.ItemFactory;
import com.nsoz.store.ItemStore;
import com.nsoz.store.StoreManager;
import com.nsoz.util.NinjaUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author kitakeyos - Hoàng Hữu Dũng
 */
public class SelectCard extends AbsSelectCard {

    private static final SelectCard instance = new SelectCard();

    public static SelectCard getInstance() {
        return instance;
    }

    public static final long EXPIRE_3_DAY = 3 * 24 * 60 * 60 * 1000;
    public static final long EXPIRE_7_DAY = 7 * 24 * 60 * 60 * 1000;

    @Override
    protected void init() {
        add(Card.builder().id(ItemName.TUI_VAI_CAP_3).rate(1).build());
        add(Card.builder().id(ItemName.MAT_NA_KINMOU).rate(2).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_KINMOU).rate(1).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_KINMOU_NU).rate(2).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_KINMOU_NU).rate(1).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_VEGETA).rate(1.5).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_VEGETA).rate(0.5).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_KUNOICHI).rate(1.5).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_KUNOICHI).rate(0.5).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_SUPER_BROLY).rate(1).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_SUPER_BROLY).rate(0.4).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_ONNA_BUGEISHA).rate(1).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.MAT_NA_ONNA_BUGEISHA).rate(1).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.HUYET_SAC_HUNG_LANG).rate(0.3).expire(EXPIRE_3_DAY).build());
        add(Card.builder().id(ItemName.HUYET_SAC_HUNG_LANG).rate(0.1).expire(EXPIRE_7_DAY).build());
        add(Card.builder().id(ItemName.HUYET_SAC_HUNG_LANG).rate(0.01).build());
        add(Card.builder().id(ItemName.DA_CAP_5).rate(15).build());
        add(Card.builder().id(ItemName.DA_CAP_6).rate(14).build());
        add(Card.builder().id(ItemName.DA_CAP_7).rate(13).build());
        add(Card.builder().id(ItemName.DA_CAP_8).rate(12).build());
        add(Card.builder().id(ItemName.DA_CAP_9).rate(11).build());
        add(Card.builder().id(ItemName.DA_CAP_10).rate(9).build());
        add(Card.builder().id(ItemName.DA_CAP_11).rate(5).build());
        add(Card.builder().id(ItemName.DA_CAP_12).rate(2).build());
        add(Card.builder().id(ItemName.GA_TAY).rate(10).build());
        add(Card.builder().id(ItemName.TOM_HUM).rate(10).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(10000).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(20000).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(30000).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(50000).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(100000).build());
        add(Card.builder().id(ItemName.YEN).rate(10).quantity(200000).build());
        add(Card.builder().id(ItemName.LANG_BAO).rate(0.1).build());
        add(Card.builder().id(ItemName.KHI_BAO).rate(0.1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_IKKAKUJUU).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_HIBASHIRI).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_SAIHYOKEN).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_AISU_MEIKU).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_KAMINARI).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_KOKAZE).rate(1).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_PAWARAIKOU).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_TOTOGAI).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_KITSUKEMAGUMA).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_TOTAAIGO).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_IKENNOTTO).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_OOENJO).rate(3).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_MAAJIZANGEKI).rate(2).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_BAANINGUFUKIYA).rate(2).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_FURIIZUKATTO).rate(2).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_FUROOZUNKYUUSEN).rate(2).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_BAASUTOSUTOOMU).rate(2).build());
        add(Card.builder().id(ItemName.SACH_VO_CONG_KOUGEKITENRAI).rate(2).build());
        add(Card.builder().id(ItemName.DUI_HEO_SUA_CAO_CAP).rate(5).build());
        add(Card.builder().id(ItemName.BAO_HIEM_SO_CAP).rate(5).build());
        add(Card.builder().id(ItemName.SASHIMI_CAO_CAP).rate(5).build());
        add(Card.builder().id(ItemName.GA_QUAY_CAO_CAP).rate(5).build());
        add(Card.builder().id(ItemName.HOAN_COT_CHI_CHU_SO_CAP).rate(10).build());
        add(Card.builder().id(ItemName.HOAN_COT_CHI_CHU_TRUNG_CAP).rate(10).build());
    }

    @Override
    protected Card reward(@NotNull Char p, Card card) {
        int itemID = card.getId();
        int quantity = card.getQuantity();
        if (itemID == ItemName.YEN) {
            p.addYen(quantity);
            p.serverMessage("Bạn nhận được " + NinjaUtils.getCurrency(quantity) + " Yên");
        } else {
            Item item = ItemFactory.getInstance().newItem(itemID);
            long expire = card.getExpire();
            if (expire == -1) {
                item.expire = -1;
            } else {
                item.expire = System.currentTimeMillis() + expire;
            }
            if (NinjaUtils.nextInt(2000) == 0 || p.user.isAdmin()) {
                int itemLevel = p.level / 10 * 10;
                if (itemLevel < 10) {
                    itemLevel = 10;
                }
                if (itemLevel > 80) {
                    itemLevel = 80;
                }
                List<ItemStore> list = StoreManager.getInstance().getListEquipmentWithLevelRange(itemLevel, itemLevel + 9);
                if (!list.isEmpty()) {
                    int rd = NinjaUtils.nextInt(list.size());
                    ItemStore itemStore = list.get(rd);
                    if (itemStore != null) {
                        itemID = itemStore.getItemID();
                        item = Converter.getInstance().toItem(itemStore, Converter.MAX_OPTION);
                        card = Card.builder().id(itemID).build();
                    }
                }
            }
            p.addItemToBag(item);
        }
        return card;
    }

    @Override
    protected boolean isCanSelect(Char p) {
        int index = p.getIndexItemByIdInBag(ItemName.PHIEU_MAY_MAN);
        if (index == -1 || p.bag[index] == null || !p.bag[index].has()) {
            p.serverDialog("Bạn không có phiếu may mắn!");
            return false;
        }
        if (p.getSlotNull() == 0) {
            p.serverDialog("Không đủ chỗ trống.");
            return false;
        }
        return true;
    }

    @Override
    protected void selecctCardSuccessful(@NotNull Char p) {
        int index = p.getIndexItemByIdInBag(ItemName.PHIEU_MAY_MAN);
        p.removeItem(index, 1, true);
        if (p.taskId == TaskName.NV_THU_TAI_MAY_MAN) {
            if (p.taskMain != null && p.taskMain.index == 3) {
                p.updateTaskCount(1);
            }
        }
    }

}
