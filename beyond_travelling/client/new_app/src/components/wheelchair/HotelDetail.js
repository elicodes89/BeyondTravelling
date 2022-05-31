import React from 'react';

const HotelDetail = ({region, onRegionClick}) => {

  const handleClick = function(){
    onRegionClick(region);
  }

  return <li onClick={handleClick}>{region.name}</li>
  
}

export default HotelDetail;