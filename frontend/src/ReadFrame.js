import React, { useState, useEffect } from 'react';

function ImageComponent() {
  const [imageSrc, setImageSrc] = useState(null);

  useEffect(() => {
    // 서버에서 바이너리 데이터를 가져옴
    fetch('http://localhost:8080/0')
      .then(response => response.blob())
      .then(blob => {
        const imageUrl = URL.createObjectURL(blob);
        setImageSrc(imageUrl);
      })
      .catch(error => console.error('Error fetching image:', error));
  }, []);

  return (
    <div>
      <img src={imageSrc} alt="Fetched Image" />
    </div>
  );
}

export default ImageComponent;
