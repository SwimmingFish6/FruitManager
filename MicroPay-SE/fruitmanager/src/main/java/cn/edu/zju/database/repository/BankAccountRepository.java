package cn.edu.zju.database.repository;

import cn.edu.zju.database.entity.BankAccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 51499 on 2017/7/8 0008.
 */
@Repository
@Transactional
public interface BankAccountRepository extends CrudRepository<BankAccountEntity,Long> {
    public List<BankAccountEntity> findByUid(long uid);
}
