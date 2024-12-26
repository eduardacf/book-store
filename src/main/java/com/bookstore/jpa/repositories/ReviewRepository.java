package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
