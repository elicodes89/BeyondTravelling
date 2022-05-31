import React from 'react';
import HotelDetail from './HotelDetail';

const HotelList = ({regions, onRegionClick}) => {

  // if (regions != undefined && regions != null){

    const regionsItems = regions.map((region, index) => {
      return <HotelDetail region={region} key={index} onRegionClick={onRegionClick} />
    })
    
  // }
  
    return (
      
    <div>
    <ul>
      <h1>Hello from hotel list</h1>
      {regionsItems}
    </ul>
  </div>
  )
};

export default HotelList;