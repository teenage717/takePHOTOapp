# Media App

**Media App** is an Android application that allows users to take photos using the device's camera, browse through saved images in a gallery, and view images in fullscreen. The app utilizes **CameraX** for camera functionality and **Glide** for efficient image loading and caching.

## Features

- **Camera Functionality**: Users can take photos using their device's camera.
- **Image Gallery**: Displays a grid view of all saved photos.
- **Fullscreen Image Viewer**: Allows users to view images in full resolution by tapping on thumbnails in the gallery.
  
## Libraries Used

- [CameraX](https://developer.android.com/training/camerax) - Camera API for taking pictures.
- [Glide](https://bumptech.github.io/glide/) - Image loading and caching library.
  
## Screenshots

<p align="center">
  <img width="260" height="450" src="https://github.com/user-attachments/assets/be8cbd65-0f4c-4187-87bc-7bb7f88ed56d">
  <img width="260" height="450" src="https://github.com/user-attachments/assets/428622f4-8a7a-4810-94cd-518125a1734f">
  <img width="260" height="450" src="https://github.com/user-attachments/assets/a96d648e-347b-4824-aeb4-2970c03014c6">
</p>

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/media-app.git
   cd media-app
   ```
2. Open the project in Android Studio.
3. Build and run the app on your Android device or emulator.

## Permissions

This app requires the following permissions:
- `CAMERA` - To take photos.
- `WRITE_EXTERNAL_STORAGE` - To save captured photos in the device storage.

Make sure to grant these permissions for the app to function properly.

## App Structure

- `CameraActivity.java`: Manages the camera preview and photo capture.
- `GalleryActivity.java`: Displays saved images in a grid layout.
- `ImageViewActivity.java`: Opens the image in full resolution.
- `ImageAdapter.java`: Handles the display of thumbnails in the gallery.

## Usage

1. Launch the app.
2. On the main screen, access the camera to capture images.
3. Navigate to the gallery to view saved images.
4. Tap on an image to view it in fullscreen.
