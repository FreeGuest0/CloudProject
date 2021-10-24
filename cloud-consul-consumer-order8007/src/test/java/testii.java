import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @CLASS_NAME testii
 * @CLASS_EXPLAIN 此处填写说明
 * @Author zxd
 * @Date 2021/9/10 下午11:57
 */
@Slf4j
public class testii {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Test
    public int tt1(){
        int current;
        int next;

        do{
            current = this.atomicInteger.get();
            next = current >=20 ? 0: current+1;
            System.out.println(current+"    "+next);
        }while(!atomicInteger.compareAndSet(current,next));
        System.out.println("next "+atomicInteger.get());
        return next;
    }
    @Test
    public void tt2(){
        System.out.println(atomicInteger.compareAndSet(2,3));
        System.out.println(atomicInteger.compareAndSet(3,8));
        System.out.println(atomicInteger.compareAndSet(8,7));
    }

//    @Test
//    public void tt3(){
//        int corrent ;
//        int nexts;
//        do{
//            corrent = this.atomicInteger.get();
//            if(corrent<20){
//                nexts = corrent >=2147483647 ? 0: corrent+1;
//            }
//        }while(atomicInteger.compareAndSet(corrent, nexts));
//    }

    @Test
    public void tt3(){
        System.out.println(123%2+"   "+tt1());
    }

}
