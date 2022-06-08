package com.ag04.utils;

/**
 *
 * @author valentinakriz
 *
 */
public class DummyServiceImpl implements DummyService {

    @Override
    public DummyDTO get(Long id) {
        return new DummyDTO(id, "AAAAA");
    }

    @Override
    public DummyDTO save(DummyDTO testDto) {
        return testDto;
    }
    
}
