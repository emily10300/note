package note.emily.mapper;

import java.util.List;
import note.emily.entity.ExpenseRecord;
import org.apache.ibatis.annotations.Param;

public interface ExpenseRecordMapper {
    int deleteByPrimaryKey(@Param("expenseId") Long expenseId, @Param("memberMemberId") Long memberMemberId);

    int insert(ExpenseRecord record);

    ExpenseRecord selectByPrimaryKey(@Param("expenseId") Long expenseId, @Param("memberMemberId") Long memberMemberId);

    List<ExpenseRecord> selectAll();

    int updateByPrimaryKey(ExpenseRecord record);
}