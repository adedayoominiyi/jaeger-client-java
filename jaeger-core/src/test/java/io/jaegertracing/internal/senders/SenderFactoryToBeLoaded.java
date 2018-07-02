/*
 * Copyright (c) 2018, The Jaeger Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.jaegertracing.internal.senders;

import io.jaegertracing.Configuration;
import io.jaegertracing.spi.Sender;
import io.jaegertracing.spi.SenderFactory;

public class SenderFactoryToBeLoaded implements SenderFactory {
  public static Sender sender = new NoopSender();

  @Override
  public Sender getSender(Configuration.SenderConfiguration senderConfiguration) {
    return sender;
  }

  @Override
  public String getType() {
    return "to-be-loaded";
  }

  @Override
  public String toString() {
    return "SenderFactoryToBeLoaded{}";
  }
}