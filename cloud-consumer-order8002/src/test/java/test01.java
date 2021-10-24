import com.zxd.Config.LoadBelance.MyLB;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @CLASS_NAME test01
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/12 下午1:07
 */

@Slf4j
public class test01 {


    @Test
    public final int getAndIncrement(){
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("sssss");
        int current, next;
        do{
            current = atomicInteger.get();
            next = current >= 2147483647 ? 0 : current+1;
        }while(!atomicInteger.compareAndSet(current, next));
        log.info("访问次数为："+next);
        return next;
    }

}
