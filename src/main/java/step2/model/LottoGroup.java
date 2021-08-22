package step2.model;

import java.util.ArrayList;
import java.util.List;

public class LottoGroup {
    private List<Lotto> lottoList;

    public LottoGroup(LottoStrategy lottoStrategy, int lottoCount) {
        lottoList = new ArrayList<>();

        while (lottoCount-- > 0) {
            lottoList.add(new Lotto(lottoStrategy.getNumbers()));
        }
    }

    public LottoGroup(List<Lotto> lottoList) {
        this.lottoList = lottoList;
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }

    public List<List<Integer>> getLottoResult() {
        List<List<Integer>> result = new ArrayList<>();

        for (Lotto lotto : lottoList) {
            result.add(lotto.getLottoNumbers());
        }

        return result;
    }

    public int size() {
        return lottoList.size();
    }

    public List<Lotto> combineGroup(LottoGroup manualLottoGroup, LottoGroup autoLottoGroup) {
        List<Lotto> allLottoList = new ArrayList<>();
        allLottoList.addAll(autoLottoGroup.getLottoList());
        allLottoList.addAll(manualLottoGroup.getLottoList());
        return allLottoList;
    }
}
