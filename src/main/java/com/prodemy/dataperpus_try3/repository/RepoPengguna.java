package com.prodemy.dataperpus_try3.repository;

import com.prodemy.dataperpus_try3.entity.EntityPengguna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPengguna extends JpaRepository<EntityPengguna, Integer> {
}
