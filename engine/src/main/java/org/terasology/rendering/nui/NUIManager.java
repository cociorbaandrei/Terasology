/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.nui;

import org.terasology.asset.AssetUri;
import org.terasology.reflection.metadata.ClassLibrary;
import org.terasology.entitySystem.systems.ComponentSystem;

/**
 * @author Immortius
 */
public interface NUIManager extends ComponentSystem, FocusManager {

    boolean isOpen(String screenUri);

    boolean isOpen(AssetUri screenUri);

    UIScreenLayer getScreen(AssetUri screenUri);

    UIScreenLayer getScreen(String screenUri);

    void closeScreen(String screenUri);

    void closeScreen(AssetUri screenUri);

    void closeScreen(UIScreenLayer screen);

    void toggleScreen(String screenUri);

    void toggleScreen(AssetUri screenUri);

    UIScreenLayer pushScreen(AssetUri screenUri);

    UIScreenLayer pushScreen(String screenUri);

    <T extends UIScreenLayer> T pushScreen(AssetUri screenUri, Class<T> expectedType);

    <T extends UIScreenLayer> T pushScreen(String screenUri, Class<T> expectedType);

    void pushScreen(UIScreenLayer screen);

    void popScreen();

    UIScreenLayer setScreen(AssetUri screenUri);

    UIScreenLayer setScreen(String screenUri);

    <T extends UIScreenLayer> T setScreen(AssetUri screenUri, Class<T> expectedType);

    <T extends UIScreenLayer> T setScreen(String screenUri, Class<T> expectedType);

    void setScreen(UIScreenLayer screen);

    void closeAllScreens();

    void render();

    void update(float delta);

    ClassLibrary<UIWidget> getWidgetMetadataLibrary();

    void setFocus(UIWidget element);

    UIWidget getFocus();
}