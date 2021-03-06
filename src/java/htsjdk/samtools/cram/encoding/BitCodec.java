/*******************************************************************************
 * Copyright 2013 EMBL-EBI
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package htsjdk.samtools.cram.encoding;

import htsjdk.samtools.cram.io.BitInputStream;
import htsjdk.samtools.cram.io.BitOutputStream;

import java.io.IOException;

public interface BitCodec<T> {

	public T read(BitInputStream bis) throws IOException;

	public T read(BitInputStream bis, int valueLen) throws IOException;

	public void readInto(BitInputStream bis, byte[] array, int offset,
			int valueLen) throws IOException;

	public void skip(BitInputStream bis) throws IOException;

	public void skip(BitInputStream bis, int len) throws IOException;

	public long write(BitOutputStream bos, T object) throws IOException;

	public long numberOfBits(T object);

}
