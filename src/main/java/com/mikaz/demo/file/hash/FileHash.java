package com.mikaz.demo.file.hash;

import com.mikaz.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
