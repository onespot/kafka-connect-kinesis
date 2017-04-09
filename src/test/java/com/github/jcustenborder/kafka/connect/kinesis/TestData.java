/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.kinesis;

import com.amazonaws.services.kinesis.model.Record;
import com.google.common.base.Charsets;

import java.nio.ByteBuffer;
import java.util.Date;

class TestData {

  final static String expectedPartitionKey = "Testing";
  final static byte[] expectedData = "Testing data".getBytes(Charsets.UTF_8);
  final static String expectedSequenceNumber = "34523452";
  final static Date expectedApproximateArrivalTimestamp = new Date(1491757701123L);

  public static Record record() {
    return new Record()
        .withApproximateArrivalTimestamp(expectedApproximateArrivalTimestamp)
        .withData(ByteBuffer.wrap(expectedData))
        .withPartitionKey(expectedPartitionKey)
        .withSequenceNumber(expectedSequenceNumber);
  }


}