package com.ning.compress.lzf;
/*
 *
 * Copyright 2009-2013 Ning, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/


import com.ning.compress.CompressionFormatException;

public class LZFException extends CompressionFormatException
{
    private static final long serialVersionUID = 1L;

    public LZFException(String message) {
        super(message);
    }

    public LZFException(Throwable t) {
        super(t);
    }

    public LZFException(String message, Throwable t) {
        super(message, t);
    }
}