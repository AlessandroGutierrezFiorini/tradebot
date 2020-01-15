package com.trade.bot.repository;

import com.trade.bot.model.Bot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BotRepository implements CrudRepository<Bot, Integer> {
    @Override
    public <S extends Bot> S save(S s) {
        return null;
    }

    @Override
    public <S extends Bot> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Bot> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Bot> findAll() {
        return null;
    }

    @Override
    public Iterable<Bot> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Bot bot) {

    }

    @Override
    public void deleteAll(Iterable<? extends Bot> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
