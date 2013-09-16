package com.ning.compress;
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


import java.io.IOException;

/**
 * Base exception used by compression codecs when encountering a problem
 * with underlying data format, usually due to data corruption
 * 
 * @since 0.9.6
 */
public class CompressionFormatException extends IOException
{
    private static final long serialVersionUID = 1L;

    protected CompressionFormatException(String message) {
        super(message);
    }

    protected CompressionFormatException(Throwable t) {
        super();
        initCause(t);
    }

    protected CompressionFormatException(String message, Throwable t) {
        super(message);
        initCause(t);
    }
}