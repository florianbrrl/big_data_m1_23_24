package fr.miage.m1.big_data_m1_23_24.repositories;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GeneriqueRepo<T, ID> extends JpaRepository<T, ID> {
    // Common repository methods that you would like to have across all repositories
}
