<!DOCTYPE html>
<html>

<body>

<h1>Jetpack Compose Animation Project</h1>

<p>Welcome to my Jetpack Compose Animation Project! This project showcases three distinct animations created using Jetpack Compose: a bouncing ball, a continuously moving square, and a rotating square. Feel free to explore the code and use it as a reference for your own projects.</p>

<h2>Animations</h2>

<h3>Bouncing Ball</h3>
<p>The bouncing ball animation demonstrates the use of physics-based animation in Jetpack Compose. The ball bounces off the edges of the screen, simulating a realistic bouncing effect.</p>
<video width="320" height="240" controls>
  
</video>


<h3>Continuously Moving Square</h3>
<p>This animation features a square that moves continuously across the screen. It highlights the use of infinite transitions in Jetpack Compose to create seamless and smooth animations.</p>
<video width="320" height="240" controls>
  <source src="link_to_your_video" type="video/mp4">
  Your browser does not support the video tag.
</video>

<h3>Rotating Square</h3>
<p>The rotating square animation showcases a simple rotation effect. The square rotates around its center point, demonstrating the use of rotation transformations in Jetpack Compose.</p>
<video width="320" height="240" controls>
  <source src="link_to_your_video" type="video/mp4">
  Your browser does not support the video tag.
</video>

<h2>Getting Started</h2>

<p>To run this project locally, follow these steps:</p>
<ol>
  <li><strong>Clone the repository:</strong>
    <pre><code>git clone https://github.com/your_username/jetpack-compose-animation.git
cd jetpack-compose-animation</code></pre>
  </li>
  <li><strong>Open the project in Android Studio:</strong>
    <p>Open Android Studio and select <code>File -> Open</code>, then navigate to the project directory you just cloned.</p>
  </li>
  <li><strong>Build and run the project:</strong>
    <p>Click on the <code>Run</code> button or use the shortcut <code>Shift + F10</code> to build and run the project on an emulator or physical device.</p>
  </li>
</ol>

<h2>Dependencies</h2>

<p>This project uses the following dependencies:</p>
<pre><code>implementation ("androidx.compose.ui:ui:1.6.8")
implementation ("androidx.compose.animation:animation:1.6.8")
implementation ("androidx.compose.ui:ui-tooling:1.6.8")
implementation ("androidx.compose.foundation:foundation:1.6.8")
implementation ("androidx.compose.material3:material3:1.2.1")
implementation ("androidx.compose.runtime:runtime-livedata:1.6.8")
implementation ("androidx.compose.ui:ui-tooling-preview:1.6.8")
implementation("io.coil-kt:coil-compose:2.0.0")</code></pre>

<h2>Project Structure</h2>

<ul>
  <li><code>MainActivity.kt</code>: The main entry point of the application where the animations are defined and displayed.</li>
  <li><code>BouncingBall.kt</code>: Contains the implementation of the bouncing ball animation.</li>
  <li><code>MovingSquare.kt</code>: Contains the implementation of the continuously moving square animation.</li>
  <li><code>RotatingSquare.kt</code>: Contains the implementation of the rotating square animation.</li>
</ul>

<h2>Contributing</h2>

<p>If you have suggestions or improvements, feel free to open an issue or submit a pull request. Contributions are always welcome!</p>

<h2>License</h2>

<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for more details.</p>

</body>
</html>
