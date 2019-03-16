// <auto-generated>
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Azure.IIoT.Opc.Twin.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Browse nodes by path
    /// </summary>
    public partial class BrowsePathRequestApiModel
    {
        /// <summary>
        /// Initializes a new instance of the BrowsePathRequestApiModel class.
        /// </summary>
        public BrowsePathRequestApiModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the BrowsePathRequestApiModel class.
        /// </summary>
        /// <param name="browsePaths">The paths to browse from node.
        /// (mandatory)</param>
        /// <param name="nodeId">Node to browse from.
        /// (default: RootFolder).</param>
        /// <param name="readVariableValues">Whether to read variable values on
        /// target nodes.
        /// (default is false)</param>
        /// <param name="header">Optional request header</param>
        public BrowsePathRequestApiModel(IList<IList<string>> browsePaths, string nodeId = default(string), bool? readVariableValues = default(bool?), RequestHeaderApiModel header = default(RequestHeaderApiModel))
        {
            NodeId = nodeId;
            BrowsePaths = browsePaths;
            ReadVariableValues = readVariableValues;
            Header = header;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets node to browse from.
        /// (default: RootFolder).
        /// </summary>
        [JsonProperty(PropertyName = "nodeId")]
        public string NodeId { get; set; }

        /// <summary>
        /// Gets or sets the paths to browse from node.
        /// (mandatory)
        /// </summary>
        [JsonProperty(PropertyName = "browsePaths")]
        public IList<IList<string>> BrowsePaths { get; set; }

        /// <summary>
        /// Gets or sets whether to read variable values on target nodes.
        /// (default is false)
        /// </summary>
        [JsonProperty(PropertyName = "readVariableValues")]
        public bool? ReadVariableValues { get; set; }

        /// <summary>
        /// Gets or sets optional request header
        /// </summary>
        [JsonProperty(PropertyName = "header")]
        public RequestHeaderApiModel Header { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (BrowsePaths == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "BrowsePaths");
            }
        }
    }
}
