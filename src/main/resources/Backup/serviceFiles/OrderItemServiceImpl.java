package templates.Backup.serviceFiles;

import com.springProject.shooz.entity.OrderItem;
import com.springProject.shooz.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService{
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

//    @Override
//    public Optional<OrderItem> getOrderItemById(int id) {
//        return orderItemRepository.findById(id);
//    }
//
//    @Override
//    public OrderItem saveOrderItem(OrderItem orderItem) {
//        return orderItemRepository.save(orderItem);
//    }
//
//    @Override
//    public void deleteOrderItem(int id) {
//        orderItemRepository.deleteById(id);
//    }
//
//    @Override
//    public List<OrderItem> getOrderItemsByOrderId(int orderId) {
//        return orderItemRepository.findByOrderId(orderId);
//    }
//
//    @Override
//    public List<OrderItem> getOrderItemsByProductId(int productId) {
//        return orderItemRepository.findByProductId(productId);
//    }
}
