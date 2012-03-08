/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.mk.model;

import org.apache.jackrabbit.mk.store.Binding;
import org.apache.jackrabbit.mk.store.NotFoundException;

import java.util.Iterator;
import java.util.Map;

/**
 *
 */
public interface Node {

    Map<String, String> getProperties();
    
    ChildNodeEntry getChildNodeEntry(String name);

    Iterator<String> getChildNodeNames(int offset, int count);
    int getChildNodeCount();
    
    Iterator<ChildNodeEntry> getChildNodeEntries(int offset, int count);

    Iterator<ChildNode> getChildNodes(int offset, int count) throws Exception;
    Node getNode(String relPath) throws NotFoundException, Exception;

    void serialize(Binding binding) throws Exception;
}
